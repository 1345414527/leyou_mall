package top.codekiller.leyou.elasticsearch;

import com.leyou.common.pojo.PageResult;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import top.codekiller.leyou.LeyouSearchApplication;
import top.codekiller.leyou.pojo.bo.SpuBo;
import top.codekiller.leyou.search.client.GoodsClient;
import top.codekiller.leyou.search.pojo.Goods;
import top.codekiller.leyou.search.repository.GoodsRepository;
import top.codekiller.leyou.search.service.impl.SearchService;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LeyouSearchApplication.class)
public class ElasticTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private SearchService searchService;

    @Autowired
    private GoodsClient goodsClient;

    @Test
    public void test(){
        //创建索引和映射
        this.elasticsearchTemplate.createIndex(Goods.class);
        this.elasticsearchTemplate.putMapping(Goods.class);

        Integer page = 1;
        Integer rows = 100;
        do {

            //分页查询spu，获取分页结果集
            PageResult<SpuBo> result = this.goodsClient.querySpuByPage(null, null, page, rows);
            //获取当前页的数据
            List<SpuBo> items = result.getItems();
            //处理
            List<Goods> goods = items.stream().map(spuBo -> {
                try {
                    return this.searchService.buildGoods(spuBo);
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }).collect(Collectors.toList());

            this.goodsRepository.saveAll(goods);
            rows=items.size();
            page++;
        }while (rows==100);


    }
}
