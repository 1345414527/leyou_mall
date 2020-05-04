package top.codekiller.test.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import top.codekiller.test.pojo.Item;

import java.util.List;

public interface ItemRepository extends ElasticsearchRepository<Item,Long> {

    /**
     * 按照title进行match查询
     * @param title
     * @return
     */
    List<Item> findByTitle(String title);

    /**
     * 按照price进行range查询
     * @param d1
     * @param d2
     * @return
     */
    List<Item> findByPriceBetween(Double d1,Double d2);
}
