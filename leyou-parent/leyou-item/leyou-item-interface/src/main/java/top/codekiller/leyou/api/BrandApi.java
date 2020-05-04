package top.codekiller.leyou.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.codekiller.leyou.pojo.Brand;


public interface BrandApi {

    /**
     * 通过id获取brand
     * @param id
     * @return
     */
    @GetMapping("brand/{id}")
    Brand queryBrandById(@PathVariable("id") Long id);


}
