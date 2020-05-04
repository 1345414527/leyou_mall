package top.codekiller.leyou.controller;

import com.leyou.common.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import top.codekiller.leyou.pojo.Brand;
import top.codekiller.leyou.service.IBrandService;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    IBrandService brandService;


    /**
     * 根据查询条件分页查询品牌信息，并排序
     * @param key 关键字
     * @param page  查询页数
     * @param rows  显示行数
     * @param sortBy 通过那个字段进行排序
     * @param desc  是否是降序
     * @return
     */
    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandsByPage(@RequestParam(value="key",required = false)String key,
                                                               @RequestParam(value="page",defaultValue = "1")Integer page,
                                                               @RequestParam(value="rows",defaultValue = "5")Integer rows,
                                                               @RequestParam(value="sortBy",required = false)String sortBy,
                                                               @RequestParam(value="desc",required = false)Boolean desc){
        PageResult<Brand> result = this.brandService.queryBrandByPage(key, page, rows, sortBy, desc);
        if( CollectionUtils.isEmpty(result.getItems())){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping()
    public ResponseEntity<Void> saveBrand(Brand brand,@RequestParam("cids") List<Long> cids){
        this.brandService.saveBrand(brand,cids);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    /**
     * 通过分类id获取对应的品牌集合
     * @param cid
     * @return
     */
    @GetMapping("cid/{cid}")
    public ResponseEntity<List<Brand>> queryBrandsByCid(@PathVariable("cid") Long cid){
        List<Brand> brands=this.brandService.queryBrandByCid(cid);
        if(CollectionUtils.isEmpty(brands)){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(brands);
    }

    /**
     * 通过id获取brand
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public ResponseEntity<Brand> queryBrandById(@PathVariable("id") Long id){
        Brand brand=this.brandService.queryBrandById(id);
        if(brand==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(brand);
    }

}
