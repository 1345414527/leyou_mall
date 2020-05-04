package top.codekiller.user.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class User {
    @TableId
    private Long id;

    @Length(min=4,max=30)
    private String username;// 用户名

    @JsonIgnore  //对象序列化为json字符串时，忽略该属性
    @Length(min=4,max=30)
    private String password;// 密码

    @Pattern(regexp = "^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$",message = "手机号不合法")
    private String phone;// 电话

    private Date created;// 创建时间

    @JsonIgnore
    private String salt;// 密码的盐值
}

