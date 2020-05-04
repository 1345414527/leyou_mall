package top.codekiller.leyou.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SpecParam {
    @TableId
    private Long id;
    private Long cid;
    private Long groupId;
    private String name;
    @TableField(value="`numeric`") //在mysql中是关键字
    private Boolean numeric;
    private String unit;
    private Boolean generic;
    private Boolean searching;
    private String segments;

}