package top.codekiller.leyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.codekiller.leyou.client.BrandClient;
import top.codekiller.leyou.client.CategoryClient;
import top.codekiller.leyou.client.GoodsClient;
import top.codekiller.leyou.client.SpecificationClient;
import top.codekiller.leyou.pojo.*;
import top.codekiller.leyou.service.IGoodsService;

import java.util.*;

@Service
public class GoodsService implements IGoodsService {
    @Autowired
    private BrandClient brandClient;

    @Autowired
    private CategoryClient categoryClient;

    @Autowired
    private GoodsClient goodsClient;

    @Autowired
    private SpecificationClient specificationClient;

    /**
     * 跳转到页面详情页
     * @param spuId
     * @return
     */
    public Map<String,Object> loadData(Long spuId){
        //使用map存储页面所需要的所有数据
        Map<String,Object> model=new HashMap<>();

        //根据spuId查询spu
        Spu spu = this.goodsClient.querySpuById(spuId);

        //根据spuId查询spuDetail
        SpuDetail spuDetail = this.goodsClient.querySpuDetailBySpuId(spuId);

        //根据spuId查询分类信息,Map<String,Object>
        List<Long> cids=Arrays.asList(spu.getCid1(), spu.getCid2(), spu.getCid3());
        List<String> names = this.categoryClient.queryNameByIds(cids);
          //初始化一个分类map
        List<Map<String,Object>> categories=new ArrayList<>();
        for (int i=0;i<cids.size();i++) {
            Map<String,Object> category=new HashMap<>();
            category.put("id",cids.get(i));
            category.put("name",names.get(i));
            categories.add(category);
        }

        //根据brandId查询品牌
        Brand brand = this.brandClient.queryBrandById(spu.getBrandId());


        //根据spuId查询所有的sku
        List<Sku> skus = this.goodsClient.querySkuBySpuId(spuId);


        //根据cid3查询所有的规格参数组合规格参数
        List<SpecGroup> groups = this.specificationClient.queryGroupsWithParamByCid(spu.getCid3());

        //根据spuId查询所有的特殊规格参数
        List<SpecParam> params = this.specificationClient.queryParams(null, spu.getCid3(), false, null);
          //初始化特殊规格参数的map
        Map<Long,String> paramMap=new HashMap<>();
        params.forEach(param->{
            paramMap.put(param.getId(),param.getName());
        });

        model.put("spu",spu);
        model.put("spuDetail",spuDetail);
        model.put("categories",categories);
        model.put("brand",brand);
        model.put("skus",skus);
        model.put("groups",groups);
        model.put("paramMap",paramMap);

        return model;
    }
}
