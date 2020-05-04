package top.codekiller.leyou.search.pojo;

import com.leyou.common.pojo.PageResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.codekiller.leyou.pojo.Brand;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class SearchResult extends PageResult<Goods> {

    /**
     * 3个分类的集合
     */
    private List<Map<String,Object>> category;

    /**
     * 品牌集合
     */
    private List<Brand> brands;

    /**
     * spec的过滤选择
     */
    private List<Map<String,Object>> specs;


    public SearchResult(List<Map<String, Object>> category, List<Brand> brands, List<Map<String, Object>> specs) {
        this.category = category;
        this.brands = brands;
        this.specs = specs;
    }

    public SearchResult(Long total, Integer totalPage, List<Goods> items, List<Map<String, Object>> category, List<Brand> brands, List<Map<String, Object>> specs) {
        super(total, totalPage, items);
        this.category = category;
        this.brands = brands;
        this.specs = specs;
    }
}
