package top.codekiller.leyou.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.codekiller.leyou.pojo.Brand;

import java.text.SimpleDateFormat;
import java.util.List;

public interface BrandMapper extends BaseMapper<Brand> {

    /**
     * 在中间表中插入数据
     * @param cid 分类id
     * @param bid 品牌id
     */
    @Insert("insert into tb_category_brand values(#{cid},#{bid})")
    void insertCategoryAndBrand(@Param("cid") Long cid, @Param("bid") Long bid);


    /**
     * 通过分类id获取品牌集合
     * @param cid
     * @return
     */
    @Select("select * from tb_brand  a inner join  tb_category_brand b on a.id=b.brand_id where b.category_id=#{cid}")
    List<Brand> selectBrandByCid(Long cid);
}
