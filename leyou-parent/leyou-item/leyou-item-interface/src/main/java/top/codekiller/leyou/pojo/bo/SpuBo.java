package top.codekiller.leyou.pojo.bo;

import lombok.Data;
import top.codekiller.leyou.pojo.Sku;
import top.codekiller.leyou.pojo.Spu;
import top.codekiller.leyou.pojo.SpuDetail;

import java.util.List;

@Data
public class SpuBo extends Spu {
    /**
     * 通过cid获取分类name
     */
    private String cname;

    /**
     * 通过bid获取品牌name
     */
    private String bname;

    /**
     * 商品详情
     */
    private SpuDetail spuDetail;

    /**
     * sku集合
     */
    private List<Sku> skus;
}
