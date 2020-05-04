package top.codekiller.leyou.api;

import com.leyou.common.pojo.PageResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import top.codekiller.leyou.pojo.Sku;
import top.codekiller.leyou.pojo.Spu;
import top.codekiller.leyou.pojo.SpuDetail;
import top.codekiller.leyou.pojo.bo.SpuBo;

import java.util.List;


public interface GoodsApi {
    /**
     * 根据spu的id查询SpuDetail
     * @param spuId
     * @return
     */
    @GetMapping("spu/detail/{spuId}")
    SpuDetail querySpuDetailBySpuId(@PathVariable("spuId") Long spuId);

    /**
     * 根据分页条件查询spu
     * @param key 关键字
     * @param saleable 上架/下架
     * @param page 当前页码
     * @param rows 当前页行
     * @return
     */
    @GetMapping("spu/page")
    PageResult<SpuBo> querySpuByPage(@RequestParam(value = "key", required = false) String key,
                                     @RequestParam(value = "saleable", required = false) Boolean saleable,
                                     @RequestParam(value = "page", defaultValue = "1") Integer page,
                                     @RequestParam(value = "rows", defaultValue = "5") Integer rows);

    /**
     * 根据spu的id查询sku的集合
     * @param spuId
     * @return
     */
    @GetMapping("sku/list")
    List<Sku> querySkuBySpuId(@RequestParam("id") Long spuId);

    /**
     * 通过id获取spu
     * @param id
     * @return
     */
    @GetMapping("{id}")
    Spu querySpuById(@PathVariable("id") Long id);


    /**
     * 通过skuId查询sku
     * @param skuId
     * @return
     */
    @GetMapping("sku/{id}")
    Sku querySkuBySkuId(@PathVariable("id") Long skuId);

}
