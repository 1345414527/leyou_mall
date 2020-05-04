package top.codekiller.test.elasticsearchTest;

import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.StringTerms;
import org.elasticsearch.search.aggregations.metrics.avg.InternalAvg;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilter;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import top.codekiller.test.repository.ItemRepository;
import top.codekiller.test.pojo.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class ElasticsearchTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private ItemRepository itemRepository;

    /**
     * 创建索引和映射
     */
    @Test
    public void testIndex() {
        // 创建索引，会根据Item类的@Document注解信息来创建
        this.elasticsearchTemplate.createIndex(Item.class);
        // 配置映射，会根据Item类中的id、Field等字段来自动完成映射
        this.elasticsearchTemplate.putMapping(Item.class);
    }

    /**
     * 新增数据
     */
    @Test
    public void testCreate(){
        //新增单个
//        Item item = new Item(1L, "小米手机7", "手机",
//                "小米", 3499.00, "http://image.leyou.com/13123.jpg");
//        this.itemRepository.save(item);

        //新增多个
        List<Item> list = new ArrayList<>();
        list.add(new Item(2L, "坚果手机R1", "手机", "锤子", 3699.00, "http://image.leyou.com/123.jpg"));
        list.add(new Item(3L, "华为META10", "手机", "华为", 4499.00, "http://image.leyou.com/3.jpg"));
        // 接收对象集合，实现批量新增
        itemRepository.saveAll(list);

    }

    /**
     * 查询数据
     */
    @Test
    public void testQuery(){
//        //根据id查询单条
//        Optional<Item> item=this.itemRepository.findById(1L);
//        System.out.println(item);

        //查询多条
        Iterable<Item> items=this.itemRepository.findAll(Sort.by("price").descending());
        items.forEach(System.out::println);

    }

    /**
     * 测试自定义方法
     */
    @Test
    public void testFindByTitle(){
        List<Item> items = this.itemRepository.findByTitle("手机");
        items.forEach(System.out::println);

        System.out.println("---------------------------------");

        List<Item> items2=this.itemRepository.findByPriceBetween(3699.0,4499.0);
        items2.forEach(System.out::println);
    }

    /**
     * 高级查询-基本查询
     */
    @Test
    public void testSearch(){
        //通过查询构建器工具构建查询条件
        MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("title", "手机");
        Iterable<Item> items = this.itemRepository.search(queryBuilder);
        items.forEach(System.out::println);
    }

    /**
     * 高级查询-自定义查询
     */
    @Test
    public void testNative(){
        //构建自定义查询构建器
        NativeSearchQueryBuilder builder=new NativeSearchQueryBuilder();

        //添加基本的查询条件
        builder.withQuery(QueryBuilders.matchQuery("title","手机"));

        //添加排序
        builder.withSort(SortBuilders.fieldSort("price").order(SortOrder.ASC));

        //添加分页条件，page：页码(从0开始)，size：每页显示条目数
        builder.withPageable(PageRequest.of(2-1,1));

        //执行查询，获取分页结果集
        Page<Item> page = this.itemRepository.search(builder.build());
        System.out.println("总页数：" + page.getTotalPages());
        System.out.println("总条数：" + page.getTotalElements());
        System.out.println("每页显示条数：" + page.getSize());
        System.out.println("当前页码：" + page.getNumber());
        page.getContent().forEach(System.out::println);

    }


    /**
     * 测试聚合
     */
    @Test
    public void testAggs(){
        //初始化自定义查询构建器
        NativeSearchQueryBuilder queryBuilder=new NativeSearchQueryBuilder();
        //添加聚合
        queryBuilder.addAggregation(AggregationBuilders.terms("brandAgg").field("brand")
                                    .subAggregation(AggregationBuilders.avg("price_avg").field("price")));
        //添加结果集过滤，不包含任何字段
        queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{},null));
        //执行聚合查询
        AggregatedPage<Item>  itemPage= (AggregatedPage<Item>) this.itemRepository.search(queryBuilder.build());
        //解析聚合结果集.从结果中取出名为brands的那个聚合，因为是利用String类型字段来进行的term聚合，所以结果要强转为StringTerm类型
        StringTerms brandAgg= (StringTerms)itemPage.getAggregation("brandAgg");
        List<StringTerms.Bucket> buckets = brandAgg.getBuckets();
        buckets.forEach(bucket -> {
            System.out.println(bucket.getKeyAsString());
            System.out.println(bucket.getDocCount());
            Map<String, Aggregation> subAggregation = bucket.getAggregations().asMap();
            InternalAvg avg =(InternalAvg)subAggregation.get("price_avg");
            System.out.println(avg.getValue());
        });
    }

}
