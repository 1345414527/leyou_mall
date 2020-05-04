package top.codekiller.leyou.service;

import com.leyou.common.pojo.PageResult;
import top.codekiller.leyou.pojo.Brand;

import java.util.List;

public interface IBrandService {
    /**
     * 根据查询条件分页查询品牌信息，并排序
     * @param key 关键字
     * @param page  查询页数
     * @param rows  显示行数
     * @param sortBy 通过那个字段进行排序
     * @param desc  是否是降序
     * @return
     */
    PageResult<Brand> queryBrandByPage(String key,Integer page,Integer rows,String sortBy,Boolean desc);


    /**
     * 增加品牌
     * @param brand 商品的信息
     * @param cids  商品的分类
     */
    void saveBrand(Brand brand, List<Long> cids);


    /**
     * 通过分类id获取对应的品牌集合
     * @param cid category.id
     * @return
     */
    List<Brand> queryBrandByCid(Long cid);

    /**
     * 通过id获取品牌信息
     * @return
     */
    Brand queryBrandById(Long id);
}
