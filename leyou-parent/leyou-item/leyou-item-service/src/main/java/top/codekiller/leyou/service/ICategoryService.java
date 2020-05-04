package top.codekiller.leyou.service;


import top.codekiller.leyou.pojo.Category;

import java.util.List;

public interface ICategoryService {

    /**
     * 根据父节点查询子节点
     * @param pid
     * @return
     */
    List<Category> queryCategoryByPid(Long pid);

    /**
     * 根据id查询分类名称
     * @param ids
     * @return
     */
    List<String> queryNamesByIds(List<Long> ids);
}
