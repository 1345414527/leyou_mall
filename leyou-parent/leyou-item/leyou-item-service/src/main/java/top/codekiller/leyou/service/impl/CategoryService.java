package top.codekiller.leyou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.codekiller.leyou.mapper.CategoryMapper;
import top.codekiller.leyou.pojo.Category;
import top.codekiller.leyou.service.ICategoryService;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据父节点查询子节点
     * @param pid
     * @return
     */
    @Override
    public List<Category> queryCategoryByPid(Long pid) {
        return this.categoryMapper.selectList(new QueryWrapper<Category>().lambda()
                                        .eq(Category::getParentId,pid));

    }


    /**
     * 根据id查询分类名称
     * @param ids
     * @return
     */
    @Override
    public List<String> queryNamesByIds(List<Long> ids) {
        List<Category> categories=this.categoryMapper.selectBatchIds(ids);
        return categories.stream().map(category -> category.getName()).collect(Collectors.toList());
    }
}
