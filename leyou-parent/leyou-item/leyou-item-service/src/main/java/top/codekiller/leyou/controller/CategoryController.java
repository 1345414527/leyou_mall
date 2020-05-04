package top.codekiller.leyou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import top.codekiller.leyou.pojo.Category;
import top.codekiller.leyou.service.ICategoryService;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    /**
     * 通过父节点的id查询子节点的id
     * @param pid
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryBypid(@RequestParam(value="pid",defaultValue = "0")Long pid){
            if(pid==null||pid<0){
                //400:参数不合法
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//                return ResponseEntity<>(HttpStatus.BAD_REQUEST);
                return ResponseEntity.badRequest().build();
            }
            List<Category> categories = this.categoryService.queryCategoryByPid(pid);
            if(CollectionUtils.isEmpty(categories)){
                //404：资源服务器未找到
//                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
                return ResponseEntity.notFound().build();
            }
            //200：查询成功
            return ResponseEntity.ok(categories);
    }


    /**
     * 通过id的集合获取分类名称的集合
     * @param ids
     * @return
     */
    @GetMapping
    public ResponseEntity<List<String>> queryNameByIds(@RequestParam("ids") List<Long> ids){
        List<String> names = this.categoryService.queryNamesByIds(ids);
        if(CollectionUtils.isEmpty(names)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(names);

    }

}
