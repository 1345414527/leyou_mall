package top.codekiller.leyou.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Category {

    @TableId
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;  //注意isParent生成的getter和setter方法需要手动加上is
    private Integer sort;


}
