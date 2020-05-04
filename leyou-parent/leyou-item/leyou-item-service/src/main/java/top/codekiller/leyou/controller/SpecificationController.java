package top.codekiller.leyou.controller;

import com.mysql.fabric.xmlrpc.base.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import top.codekiller.leyou.pojo.SpecGroup;
import top.codekiller.leyou.pojo.SpecParam;
import top.codekiller.leyou.service.impl.SpecificationService;

import java.util.List;

@RestController
@RequestMapping("spec")
public class SpecificationController {

    @Autowired
    private SpecificationService specificationService;

    /**
     * 根据分类id查询参数组
     * @param cid
     * @return
     */
    @GetMapping("groups/{cid}")
    public ResponseEntity<List<SpecGroup>> querySpecGroupsByCid(@PathVariable("cid") Long cid){
        List<SpecGroup> groups=this.specificationService.queryGroupByCid(cid);
        if(CollectionUtils.isEmpty(groups)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(groups);

    }

    /**
     * 根据条件查询规格参数
     * @param cid 分类id
     * @param gid 组id
     * @param generic 是否是通用参数
     * @param searching 是否是特殊参数
     * @return
     */
    @GetMapping("params")
    public ResponseEntity<List<SpecParam>> queryParams(@RequestParam(value = "gid",required = false)Long gid,
                                                       @RequestParam(value = "cid",required = false)Long cid,
                                                       @RequestParam(value = "generic",required = false) Boolean generic,
                                                       @RequestParam(value="searching",required = false) Boolean searching){
        List<SpecParam> params=this.specificationService.queryParams(gid,cid,generic,searching);
        System.out.println(params);
        if(CollectionUtils.isEmpty(params)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(params);
    }

    /**
     * 通过cid获取所有规格组和规格参数
     * @param cid
     * @return
     */
    @GetMapping("group/param/{cid}")
    public ResponseEntity<List<SpecGroup>> queryGroupsWithParamByCid(@PathVariable("cid") Long cid){
        List<SpecGroup> groups=this.specificationService.queryGroupsWithParamByCid(cid);
        if(CollectionUtils.isEmpty(groups)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(groups);
    }

   
}
