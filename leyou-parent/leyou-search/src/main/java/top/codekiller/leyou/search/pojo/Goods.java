package top.codekiller.leyou.search.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "goods",type="docs",replicas = 0,shards = 1)
public class Goods {
    /**
     * spuid
     */
    @Id
    private Long id;
    /**
     * 所有需要搜索的信息，包括标题，分类，品牌
     */
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String all;
    /**
     * 卖点
     */
    @Field(type=FieldType.Keyword,index = false)
    private String subTitle;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * 一级分类
     */
    private Long cid1;
    /**
     * 二级分类
     */
    private Long cid2;
    /**
     * 三级分类
     */
    private Long cid3;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 价格集合
     */
    private List<Long> price;
    /**
     * List<sku>信息的json结构
     */
    @Field(type=FieldType.Keyword,index=false)
    private String skus;
    /**
     * 可搜索的规格参数，key是参数名，值是参数值
     */
    private Map<String,Object> specs;
}
