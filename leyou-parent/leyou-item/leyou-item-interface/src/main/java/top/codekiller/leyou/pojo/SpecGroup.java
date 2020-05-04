package top.codekiller.leyou.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import java.util.List;

@Data
public class SpecGroup {
    @TableId
    private Long id;
    private Long cid;
    private String name;

    @TableField(exist = false)
    private List<SpecParam> params;
}
