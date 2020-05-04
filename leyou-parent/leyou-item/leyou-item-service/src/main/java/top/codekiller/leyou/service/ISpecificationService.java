package top.codekiller.leyou.service;


import top.codekiller.leyou.pojo.SpecGroup;
import top.codekiller.leyou.pojo.SpecParam;

import java.util.List;

/**
 * 规格参数组
 */
public interface ISpecificationService {


    /**
     * 根据分类id查询参数组
     * @param cid
     * @return
     */
    List<SpecGroup> queryGroupByCid(Long cid);

    /**
     * 根据条件查询规格参数
     * @param cid 分类id
     * @param gid 组id
     * @param generic 是否是通用参数
     * @param searching 是否是特殊参数
     * @return
     */
    List<SpecParam> queryParams(Long gid, Long cid, Boolean generic, Boolean searching);

    /**
     * 通过cid获取所有规格组和规格参数
     * @param cid
     * @return
     */
    List<SpecGroup> queryGroupsWithParamByCid(Long cid);
}
