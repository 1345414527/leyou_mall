package top.codekiller.leyou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import top.codekiller.leyou.mapper.SpecGroupMapper;
import top.codekiller.leyou.mapper.SpecParamMapper;
import top.codekiller.leyou.pojo.SpecGroup;
import top.codekiller.leyou.pojo.SpecParam;
import top.codekiller.leyou.service.ISpecificationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpecificationService implements ISpecificationService {
    @Autowired
    private SpecGroupMapper specGroupMapper;

    @Autowired
    private SpecParamMapper specParamMapper;


    /**
     * 根据条件查询规格参数
     * @param cid
     * @return
     */
    @Override
    public List<SpecGroup> queryGroupByCid(Long cid) {
        Map<String,Object> map=new HashMap<>();
        map.put("cid",cid);
        return specGroupMapper.selectByMap(map);
    }


    /**
     * 根据条件查询规格参数
     * @param cid 分类id
     * @param gid 组id
     * @param generic 是否是通用参数
     * @param searching 是否是特殊参数
     * @return
     */
    @Override
    public List<SpecParam> queryParams(Long gid, Long cid, Boolean generic, Boolean searching) {
        SpecParam params=new SpecParam();
        params.setCid(cid);
        params.setGroupId(gid);
        params.setGeneric(generic);
        params.setSearching(searching);
        return specParamMapper.selectList(new QueryWrapper<SpecParam>(params));
    }

    /**
     * 通过cid获取所有规格组和规格参数
     * @param cid
     * @return
     */
    @Override
    public List<SpecGroup> queryGroupsWithParamByCid(Long cid) {
        List<SpecGroup> groups = this.queryGroupByCid(cid);
        groups.forEach(group->{
            List<SpecParam> params=this.queryParams(group.getId(),null,null,null);
            group.setParams(params);
        });
        return groups;
    }


}
