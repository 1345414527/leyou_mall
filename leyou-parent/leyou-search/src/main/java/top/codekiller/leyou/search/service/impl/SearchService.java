package top.codekiller.leyou.search.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.leyou.common.pojo.PageResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.ibatis.annotations.Mapper;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.LongTerms;
import org.elasticsearch.search.aggregations.bucket.terms.StringTerms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilter;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import top.codekiller.leyou.pojo.*;
import top.codekiller.leyou.search.client.BrandClient;
import top.codekiller.leyou.search.client.CategoryClient;
import top.codekiller.leyou.search.client.GoodsClient;
import top.codekiller.leyou.search.client.SpecificationClient;
import top.codekiller.leyou.search.pojo.Goods;
import top.codekiller.leyou.search.pojo.SearchRequest;
import top.codekiller.leyou.search.pojo.SearchResult;
import top.codekiller.leyou.search.repository.GoodsRepository;
import top.codekiller.leyou.search.service.ISearchService;

import java.io.IOException;
import java.lang.annotation.Native;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class SearchService  implements ISearchService {

    @Autowired
    private CategoryClient categoryClient;

    @Autowired
    private GoodsClient goodsClient;

    @Autowired
    private BrandClient brandClient;

    @Autowired
    private SpecificationClient specificationClient;

    @Autowired
    private GoodsRepository goodsRepository;

    private static final ObjectMapper MAPPER=new ObjectMapper();

    @Override
    public Goods buildGoods(Spu spu) throws IOException {
        //通过分类的id查询分类名称
        List<String> names=this.categoryClient.queryNameByIds(Arrays.asList(spu.getCid1(),spu.getCid2(),spu.getCid3()));

        //根据品牌id查询品牌
        Brand brand=this.brandClient.queryBrandById(spu.getBrandId());

        //根据spuId查询所有的sku
        List<Sku> skus = this.goodsClient.querySkuBySpuId(spu.getId());
        //初始化一个价格集合
        List<Long> prices=skus.stream().map(sku-> sku.getPrice()).collect(Collectors.toList());
        //收集sku的必要字段信息
        List<Map<String,Object>> skuMapList=new ArrayList<>();
        skus.forEach(sku->{
            Map<String,Object> map=new HashMap<>();
            map.put("id",sku.getId());
            map.put("title",sku.getTitle());
            map.put("price",sku.getPrice());
            //获取sku中的图片，数据库的图片可能是多张，多张以“，”分割，返回图片数组，我们获取第一张图片
            map.put("image",StringUtils.isBlank(sku.getImages())?"":StringUtils.split(sku.getImages(),",")[0]);
            skuMapList.add(map);
        });

        //获取spu中的cid3查询出所有的搜索规格参数
        List<SpecParam> params=this.specificationClient.queryParams(null, spu.getCid3(), null, true);

        //根据spuId获取spuDetail,并且获取通用参数
        SpuDetail spuDetail=this.goodsClient.querySpuDetailBySpuId(spu.getId());
        //把通用的规格参数值，进行反序列化
        Map<String,Object> genericSpecMap=MAPPER.readValue(spuDetail.getGenericSpec(),new TypeReference<Map<String,Object>>(){});
        //把特殊的规格参数值，进行反序列化
        Map<String,List<Object>> specialSpecMap=MAPPER.readValue(spuDetail.getSpecialSpec(),new TypeReference<HashMap<String,List<Object>>>(){});



        Map<String,Object> specs=new HashMap<>();
        params.forEach(param->{
            //判断规格参数的类型，是否是通用的规格参数
            if(param.getGeneric()){
                //如果是通用类型的参数，则从genericSpecMap获取规格参数值
                String value= genericSpecMap.get(param.getId().toString()).toString();
                //判断是否为数字类型，如果是数字类型，应该返回一个区间
                if(param.getNumeric()){
                    specs.put(param.getName(),this.chooseSegment(value,param));
                }else {
                    specs.put(param.getName(), value);
                }
            }else {
                //如果是特殊的规格参数，从specialSpecMap中获取值
                List<Object> value =specialSpecMap.get(param.getId().toString());
                specs.put(param.getName(),value);
            }

        });


        Goods goods=new Goods();
        goods.setId(spu.getId());
        goods.setCid1(spu.getCid1());
        goods.setCid2(spu.getCid2());
        goods.setCid3(spu.getCid3());
        goods.setBrandId(spu.getBrandId());
        goods.setCreateTime(spu.getCreateTime());
        goods.setSubTitle(spu.getSubTitle());

        //拼接All字段，需要分类名称和品牌名称。“ ”设置空格分割是防止不同类别连着一起而被分词
        goods.setAll(spu.getTitle()+" "+ StringUtils.join(names," ") +" "+brand.getName());

        //获取spu下的所有sku价格
        goods.setPrice(prices);

        //获取spu下的所有sku，并且转为json字符串
        String skuInfo = null;
        try {
            skuInfo = MAPPER.writeValueAsString(skuMapList);
        } catch (JsonProcessingException e) {
            log.error("sku信息转化为json异常："+e.toString());
        }
        goods.setSkus(skuInfo);
        //获取所有查询的规格参数(name:value)
        goods.setSpecs(specs);

        return goods;
    }


    @Override
    public SearchResult search(SearchRequest request) {
        if(StringUtils.isBlank(request.getKey())) return null;

        //自定义查询构建器
        NativeSearchQueryBuilder queryBuilder=new NativeSearchQueryBuilder();

        //添加基本查询条件
//        MatchQueryBuilder baseBuilder=QueryBuilders.matchQuery("all",request.getKey()).operator(Operator.AND);
        //添加过滤查询条件
        BoolQueryBuilder baseBuilder=this.boolQueryBuilder(request);
        queryBuilder.withQuery(baseBuilder);



        //添加分页，页码从0开始
        queryBuilder.withPageable(PageRequest.of(request.getPage()-1,request.getSize()));
        //添加结果集过滤
        queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{"id","skus","subTitle"},null));


        //添加分类和品牌的聚合
        String categotyAggName="categories";
        String brandAggName="brands";
        queryBuilder.addAggregation(AggregationBuilders.terms(categotyAggName).field("cid3"));
        queryBuilder.addAggregation(AggregationBuilders.terms(brandAggName).field("brandId"));




        //执行查询,获取结果集
        AggregatedPage<Goods> goodsPage=(AggregatedPage<Goods>) this.goodsRepository.search(queryBuilder.build());
        List<Map<String,Object>> categories=getCategotyAggResult(goodsPage.getAggregation(categotyAggName));
        List<Brand> brands=getBrandAggResult(goodsPage.getAggregation(brandAggName));

        //判断是否是一个分类，只有一个分类是才做规格参数的集合
        List<Map<String,Object>> specs=null;
        if(!CollectionUtils.isEmpty(categories)&&categories.size()==1){
            //对规格参数进行聚合
            specs=getParamAggResult((Long)categories.get(0).get("id"),baseBuilder);
        }


        return new SearchResult(goodsPage.getTotalElements(),goodsPage.getTotalPages(),goodsPage.getContent(),categories,brands,specs);

    }

    /**
     * 构建布尔查询
     * @param request
     * @return
     */
    private BoolQueryBuilder boolQueryBuilder(SearchRequest request) {
        //获取布尔查询构建器
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();

        //给布尔查询添加基本查询条件
        boolQueryBuilder.must(QueryBuilders.matchQuery("all",request.getKey()).operator(Operator.AND));

        // 添加过滤条件
        if (CollectionUtils.isEmpty(request.getFilter())) {
            return boolQueryBuilder;
        }

        //获取用户选择的过滤信息
        Map<String, Object> filter = request.getFilter();
        for (Map.Entry<String, Object> entry : filter.entrySet()) {
            String key=entry.getKey();
            if(StringUtils.equals("品牌",key)) {
                key="brandId";
            }else if(StringUtils.equals("分类",key)){
                key="cid3";
            }else{
                key="specs."+key+".keyword";
            }
            boolQueryBuilder.filter(QueryBuilders.termQuery(key,entry.getValue()));
        }

        return boolQueryBuilder;
    }


    /**
     * 解析分类的聚合结果集
     * @param aggregation
     * @return
     */
    private List<Map<String,Object>> getCategotyAggResult(Aggregation aggregation){
        LongTerms terms = (LongTerms) aggregation;

        //获取桶的集合，转化为List<Map<String,Object>>
        return ((LongTerms) aggregation).getBuckets().stream().map(bucket -> {
            //转为为一个map
            Map<String,Object> map=new HashMap<>();
            //获取桶中的key（id）
            Long id=bucket.getKeyAsNumber().longValue();
            //根据分类id查询查询分类名称
            List<String> names=this.categoryClient.queryNameByIds(Arrays.asList(id));
            map.put("id",id);
            map.put("name",names.get(0));
            return map;
        }).collect(Collectors.toList());
    }


    /**
     * 解析品牌的聚合结果集
     * @param aggregation
     * @return
     */
    private List<Brand> getBrandAggResult(Aggregation aggregation){
        LongTerms terms = (LongTerms) aggregation;

        //获取聚合的桶
        return ((LongTerms) aggregation).getBuckets().stream().map(bucket ->
                this.brandClient.queryBrandById(bucket.getKeyAsNumber().longValue())
        ).collect(Collectors.toList());

    }


    /**
     * 根据查询条件聚合参数结果集解析
     * @param cid
     * @param baseBuilder
     * @return
     */
    private List<Map<String,Object>> getParamAggResult(Long cid,QueryBuilder baseBuilder){
        //自定义查询构建器
        NativeSearchQueryBuilder queryBuilder=new NativeSearchQueryBuilder();

        //添加基本查询条件
        queryBuilder.withQuery(baseBuilder);

        //查询要聚合的规格参数
        List<SpecParam> specParams = this.specificationClient.queryParams(null, cid, null, true);

        //添加规格参数的聚合
        specParams.forEach(param->{
            queryBuilder.addAggregation(AggregationBuilders.terms(param.getName()).field("specs."+param.getName()+".keyword"));
        });
        queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{},null));

        //执行查询
        AggregatedPage<Goods> aggregatedPage=(AggregatedPage<Goods>) this.goodsRepository.search(queryBuilder.build());

        List<Map<String,Object>> specs=new ArrayList<>();
        //解析聚合结果集,key-聚合名称(规格参数名) value=聚合对象
        Map<String, Aggregation> aggregationMap = aggregatedPage.getAggregations().asMap();
        for (Map.Entry<String, Aggregation> entry : aggregationMap.entrySet()) {
            //初始化一个map，k-规格参数名 options：聚合的规格参数值
            Map<String,Object> map=new HashMap<>();
            map.put("k",entry.getKey());
            StringTerms terms=(StringTerms)entry.getValue();
            List<StringTerms.Bucket> buckets = terms.getBuckets();
            map.put("options",buckets.stream().map(bucket-> bucket.getKey()).collect(Collectors.toList()));
            specs.add(map);
        }

        return specs;
    }
    /**
     * 获取可选区间
     *
     * @param value
     * @param p
     * @return
     */
    private String chooseSegment(String value, SpecParam p) {
        double val = NumberUtils.toDouble(value);
        String result = "其它";
        // 保存数值段
        for (String segment : p.getSegments().split(",")) {
            String[] segs = segment.split("-");
            // 获取数值范围
            double begin = NumberUtils.toDouble(segs[0]);
            double end = Double.MAX_VALUE;
            if (segs.length == 2) {
                end = NumberUtils.toDouble(segs[1]);
            }
            // 判断是否在范围内
            if (val >= begin && val < end) {
                if (segs.length == 1) {
                    result = segs[0] + p.getUnit() + "以上";
                } else if (begin == 0) {
                    result = segs[1] + p.getUnit() + "以下";
                } else {
                    result = segment + p.getUnit();
                }
                break;
            }
        }
        return result;
    }


    /**
     * 通过spuId获取spu并保存
     * @param spuId
     * @throws IOException
     */
    public void save(Long spuId) throws IOException {
        Spu spu = this.goodsClient.querySpuById(spuId);
        Goods goods = this.buildGoods(spu);
        this.goodsRepository.save(goods);
    }

    /**
     * 通过spuId删除spu
     * @param spuId
     */
    public void delete(Long spuId){
        this.goodsRepository.deleteById(spuId);
    }

}


