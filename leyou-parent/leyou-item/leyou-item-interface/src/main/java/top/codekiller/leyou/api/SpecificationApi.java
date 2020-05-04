package top.codekiller.leyou.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.codekiller.leyou.pojo.SpecGroup;
import top.codekiller.leyou.pojo.SpecParam;
import java.util.List;


public interface SpecificationApi {



    /**
     * 根据条件查询规格参数
     * @param cid 分类id
     * @param gid 组id
     * @param generic 是否是通用参数
     * @param searching 是否是特殊参数
     * @return
     */
    @GetMapping("spec/params")
     List<SpecParam> queryParams(@RequestParam(value = "gid",required = false)Long gid,
                               @RequestParam(value = "cid",required = false)Long cid,
                               @RequestParam(value = "generic",required = false) Boolean generic,
                               @RequestParam(value="searching",required = false) Boolean searching);


    /**
     * 通过cid获取所有规格组和规格参数
     * @param cid
     * @return
     */
    @GetMapping("spec/group/param/{cid}")
    List<SpecGroup> queryGroupsWithParamByCid(@PathVariable("cid") Long cid);
   
}
