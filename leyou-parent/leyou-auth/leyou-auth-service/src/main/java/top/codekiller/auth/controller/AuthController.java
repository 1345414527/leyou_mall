package top.codekiller.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.codekiller.auth.pojo.UserInfo;
import top.codekiller.auth.properties.JwtProperties;
import top.codekiller.auth.service.IAuthService;
import top.codekiller.auth.service.impl.AuthServiceImpl;
import top.codekiller.auth.util.CookieUtils;
import top.codekiller.auth.util.JwtUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;


@Controller
@Slf4j
public class AuthController {

    @Autowired
    private AuthServiceImpl authService;

    @Autowired
    private JwtProperties jwtProperties;

    /**
     * 授权
     * @param username
     * @param password
     * @param request
     * @param response
     * @return
     */
    @PostMapping("accredit")
    public ResponseEntity<Void> accredit(@RequestParam("username") String username, @RequestParam("password") String password
                                            , HttpServletRequest request, HttpServletResponse response){
        String token=this.authService.accredit(username,password);
        if(StringUtils.isBlank(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        // 将token写入cookie,并指定httpOnly为true，防止通过JS获取和修改
        CookieUtils.setCookie(request,response,jwtProperties.getCookieName(),token,jwtProperties.getExpire()*60,null,true);

        return ResponseEntity.ok(null);

    }

    @GetMapping("verify")
    public ResponseEntity<UserInfo> verify(@CookieValue("LY_TOKEN")String token,HttpServletRequest request,HttpServletResponse response){
        try {
            //通过jwt工具类使用公钥解析jwt
            UserInfo user= JwtUtils.getInfoFromToken(token,this.jwtProperties.getPublicKey());
            if(user==null){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }

            //刷新jwt中有效时间
            token = JwtUtils.generateToken(user, this.jwtProperties.getPrivateKey(), this.jwtProperties.getExpire());
            //刷新cookie中的有效时间
            CookieUtils.setCookie(request,response,this.jwtProperties.getCookieName(),token,this.jwtProperties.getExpire()*60);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            log.error("身份认证失败",e);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
