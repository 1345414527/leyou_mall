package top.codekiller.leyou.search.service;

import com.leyou.common.pojo.PageResult;
import top.codekiller.leyou.pojo.Spu;
import top.codekiller.leyou.search.pojo.Goods;
import top.codekiller.leyou.search.pojo.SearchRequest;
import top.codekiller.leyou.search.pojo.SearchResult;

import java.io.IOException;


public interface ISearchService {

    /**
     * 创建基本数据
     * @param spu
     * @return
     * @throws IOException
     */
    Goods buildGoods(Spu spu) throws IOException;

    /**
     * 查询获取分页结果集
     * @return
     * @param request
     */
    SearchResult search(SearchRequest request);


    /**
     * 通过spuId获取spu并保存
     * @param spuId
     * @throws IOException
     */
    void save(Long spuId) throws IOException;

    /**
     * 通过spuId删除spu
     * @param spuId
     */
    void delete(Long spuId);


}
