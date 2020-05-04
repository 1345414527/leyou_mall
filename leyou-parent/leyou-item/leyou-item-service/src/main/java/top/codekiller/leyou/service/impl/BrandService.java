package top.codekiller.leyou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leyou.common.pojo.PageResult;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.codekiller.leyou.mapper.BrandMapper;
import top.codekiller.leyou.pojo.Brand;
import top.codekiller.leyou.service.IBrandService;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class BrandService implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;
    /**
     * 根据查询条件分页查询品牌信息，并排序
     * @param key 关键字
     * @param page  查询页数
     * @param rows  显示行数
     * @param sortBy 通过那个字段进行排序
     * @param desc  是否是降序
     * @return
     */
    @Override
    public PageResult<Brand> queryBrandByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc) {
        QueryWrapper<Brand> queryWrapper=new QueryWrapper<Brand>();
        //根据name模糊查询，或者根据首字母查询
        if(StringUtils.isNotBlank(key)){
            queryWrapper.like("name",key).or().eq("letter",key);
        }

        //添加排序条件
        if(StringUtils.isNotBlank(sortBy)){
            if (desc) {
                queryWrapper.orderByDesc(sortBy);
            } else {
                queryWrapper.orderByAsc(sortBy);
            }
        }

        //通过分页查询
        IPage<Brand> rpage=this.brandMapper.selectPage(new Page<Brand>(page,rows),queryWrapper);
        return new PageResult<Brand>(rpage.getTotal(),(int)rpage.getPages(),rpage.getRecords());

    }

    /**
     * 增加品牌
     * @param brand 商品的信息
     * @param cids  商品的分类
     */
    @Override
    @Transactional(rollbackFor = Exception.class)  //默认只处理RuntimeException异常，加上这个可以处理所有异常
    public void saveBrand(Brand brand, List<Long> cids) {
        //先新增brand
        this.brandMapper.insert(brand);
        //再新增中间表
        cids.forEach(cid->{
            this.brandMapper.insertCategoryAndBrand(cid,brand.getId());
        });
    }


    /**
     * 通过分类id获取对应的品牌集合
     * @param cid category.id
     * @return
     */
    @Override
    public List<Brand> queryBrandByCid(Long cid) {
        return this.brandMapper.selectBrandByCid(cid);

    }

    /**
     * 通过id获取品牌信息
     * @return
     */
    @Override
    public Brand queryBrandById(Long id) {
        return this.brandMapper.selectById(id);
    }
}
