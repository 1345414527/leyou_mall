package top.codekiller.leyou.controller;

import com.leyou.common.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import top.codekiller.leyou.pojo.Sku;
import top.codekiller.leyou.pojo.Spu;
import top.codekiller.leyou.pojo.SpuDetail;
import top.codekiller.leyou.pojo.bo.SpuBo;
import top.codekiller.leyou.service.IGoodsService;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    IGoodsService goodsService;

    /**
     * 根据分页条件查询spu
     * @param key 关键字
     * @param saleable 上架/下架
     * @param page 当前页码
     * @param rows 当前页行
     * @return
     */
    @GetMapping("spu/page")
    public ResponseEntity<PageResult<SpuBo>> querySpuByPage(@RequestParam(value="key",required = false) String key,
                                                            @RequestParam(value="saleable",required = false) Boolean saleable,
                                                            @RequestParam(value="page",defaultValue = "1") Integer page,
                                                            @RequestParam(value="rows",defaultValue = "5") Integer rows){
        PageResult<SpuBo> result=this.goodsService.querySpuByPage(key,saleable,page,rows);
        if(result==null|| CollectionUtils.isEmpty(result.getItems())){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);

    }

    /**
     * 增加商品的spu和sku
     * @param spuBo
     * @return
     */
    @PostMapping("goods")
    public ResponseEntity<Void> saveGoods(@RequestBody SpuBo spuBo){
        this.goodsService.saveGoods(spuBo);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /**
     * 根据spu的id查询SpuDetail
     * @param spuId
     * @return
     */
    @GetMapping("spu/detail/{spuId}")
    public ResponseEntity<SpuDetail> querySpuDetailBySpuId(@PathVariable("spuId") Long spuId){
        System.out.println("dfsdf");
        SpuDetail detail=this.goodsService.querySpuBySupId(spuId);
        if(detail==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(detail);
    }

    /**
     * 根据spu的id查询sku的集合
     * @param spuId
     * @return
     */
    @GetMapping("sku/list")
    public ResponseEntity<List<Sku>> querySkuBySpuId(@RequestParam("id")Long spuId){
        List<Sku> skus=this.goodsService.querySkuBySpuId(spuId);
        if(CollectionUtils.isEmpty(skus)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(skus);
    }

    /**
     * 更新商品
     * @param spuBo
     * @return
     */
    @PutMapping("goods")
    public ResponseEntity<Void> updateGoods(@RequestBody SpuBo spuBo){
        this.goodsService.updateGoods(spuBo);
        return ResponseEntity.noContent().build();
    }

    /**
     * 通过id获取spu
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public ResponseEntity<Spu> querySpuById(@PathVariable("id") Long id){
        Spu spu=this.goodsService.querySpuById(id);
        if(spu==null){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(spu);
    }


    /**
     * 通过skuId查询sku
     * @param skuId
     * @return
     */
    @GetMapping("sku/{id}")
    public ResponseEntity<Sku> querySkuBySkuId(@PathVariable("id") Long skuId){
        Sku sku=this.goodsService.querySkuBySkuId(skuId);
        if(sku==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(sku);
    }
}
