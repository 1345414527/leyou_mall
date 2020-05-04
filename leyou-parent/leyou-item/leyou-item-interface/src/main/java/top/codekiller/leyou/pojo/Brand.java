package top.codekiller.leyou.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Brand {
    @TableId
    private Long id;
    private String name;
    private String image;
    private Character letter;

}
