package top.codekiller.leyou.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.codekiller.leyou.pojo.Sku;

import java.util.List;

public interface SkuMapper extends BaseMapper<Sku> {

    @Select("select k.*,s.stock from tb_sku k inner join  tb_stock s on k.id = s.sku_id where spu_id=#{spuId}")
    List<Sku> querySkuBySpuId(@Param("spuId") Long spuId);
}
