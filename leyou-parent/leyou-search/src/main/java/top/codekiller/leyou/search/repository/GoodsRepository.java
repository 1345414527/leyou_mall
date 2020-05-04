package top.codekiller.leyou.search.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import top.codekiller.leyou.search.pojo.Goods;

public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
