package top.cokiller.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.codekiller.user.pojo.User;
import top.cokiller.user.service.IUserService;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;


    /**
     * 校验数据是否可用
     * @param data
     * @param type
     * @return
     */
    @GetMapping("/check/{data}/{type}")
    public ResponseEntity<Boolean>  checkUser(@PathVariable("data") String data,@PathVariable("type") Integer type){
        Boolean flag=this.userService.checkUser(data,type);
        if(flag==null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(flag);
    }


    /**
     * 发送验证码
     * @param phone
     * @return
     */
    @PostMapping("send")
    public ResponseEntity<Void> sendVerifyCode(@RequestParam("phone")String phone){
        Boolean flag = this.userService.sendVerifyCode(phone);
        if(flag==null){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }else if(!flag){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.noContent().build();
    }

    /**
     * 注册
     * @param user
     * @param code
     * @return
     */
    @PostMapping("register")
    public ResponseEntity<Void> register(@Valid User user, @RequestParam("code") String code){
        this.userService.register(user,code);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @GetMapping("query")
    public ResponseEntity<User> queryUser(@RequestParam("username") String username,@RequestParam("password") String password){
        User user=this.userService.queryUser(username,password);
        if(user==null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(user);
    }

}
