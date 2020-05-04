package top.codekiller.leyou.service;

import java.util.Map;

public interface IGoodsService {

    /**
     * 跳转到页面详情页
     * @param spuId
     * @return
     */
    Map<String,Object> loadData(Long spuId);
}
