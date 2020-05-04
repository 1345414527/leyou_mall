package top.codekiller.leyou.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CategoryApi {

    /**
     * 通过id的集合获取分类名称的集合
     * @param ids
     * @return
     */
    @GetMapping("category")
    List<String> queryNameByIds(@RequestParam("ids") List<Long> ids);
}
