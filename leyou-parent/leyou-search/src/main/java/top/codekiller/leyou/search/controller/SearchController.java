package top.codekiller.leyou.search.controller;

import com.leyou.common.pojo.PageResult;
import org.apache.lucene.util.CollectionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import top.codekiller.leyou.search.pojo.Goods;
import top.codekiller.leyou.search.pojo.SearchRequest;
import top.codekiller.leyou.search.pojo.SearchResult;
import top.codekiller.leyou.search.service.ISearchService;
import top.codekiller.leyou.search.service.impl.SearchService;

@Controller
public class SearchController {

    @Autowired
    private ISearchService searchService;

    @PostMapping("page")
    public ResponseEntity<SearchResult> search(@RequestBody SearchRequest request){
        SearchResult result=this.searchService.search(request);
        if(result==null|| CollectionUtils.isEmpty(result.getItems())){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }

}
