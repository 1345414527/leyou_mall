package top.codekiller.leyou.service;


import com.leyou.common.pojo.PageResult;
import org.apache.ibatis.annotations.Select;
import top.codekiller.leyou.pojo.Sku;
import top.codekiller.leyou.pojo.Spu;
import top.codekiller.leyou.pojo.SpuDetail;
import top.codekiller.leyou.pojo.bo.SpuBo;

import java.util.List;


public interface IGoodsService {

    /**
     * 根据条件来分页查询Spu
     * @param key 关键字
     * @param saleable 是否上架
     * @param page 查询的页码
     * @param rows 当前页的数据量
     * @return
     */
    PageResult<SpuBo> querySpuByPage(String key, Boolean saleable, Integer page, Integer rows);

    /**
     * 增加商品的spu和sku
     * @param spuBo
     */
    void saveGoods(SpuBo spuBo);

    /**
     * 根据spu的id查询SpuDetail
     * @param spuId
     * @return
     */
    SpuDetail querySpuBySupId(Long spuId);

    /**
     * 根据spu的id查询sku的集合
     * @param spuId
     * @return
     */

    List<Sku> querySkuBySpuId(Long spuId);

    /**
     * 跟新商品
     * @param spuBo
     */
    void updateGoods(SpuBo spuBo);

    /**
     * 通过id获取spu
     * @param id
     * @return
     */
    Spu querySpuById(Long id);

    /**
     * 通过skuId查询sku
     * @param skuId
     * @return
     */
    Sku querySkuBySkuId(Long skuId);
}
