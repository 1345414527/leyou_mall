package top.codekiller.auth.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import top.codekiller.auth.client.UserClient;
import top.codekiller.auth.pojo.UserInfo;
import top.codekiller.auth.properties.JwtProperties;
import top.codekiller.auth.service.IAuthService;
import top.codekiller.auth.util.JwtUtils;
import top.codekiller.user.pojo.User;



@Slf4j
@Service
@EnableConfigurationProperties(JwtProperties.class)
public class AuthServiceImpl implements IAuthService {

    private JwtProperties jwtProperties;

    @Autowired
    private UserClient userClient;

    public AuthServiceImpl(JwtProperties jwtProperties){
        this.jwtProperties=jwtProperties;
    }


    /**
     * 授权
     * @param username
     * @param password
     * @return
     */
    @Override
    public String accredit(String username, String password) {
        //根据用户名和密码查询
        User user = userClient.queryUser(username, password);
        System.out.println(user);
        //判断user
        if(user==null){
            return null;
        }
        try {
            //JwtUtils生成jwt的类型的token
            UserInfo userInfo=new UserInfo();
            userInfo.setId(user.getId());
            userInfo.setUsername(username);
            return JwtUtils.generateToken(userInfo,this.jwtProperties.getPrivateKey(),this.jwtProperties.getExpire());
        } catch (Exception e) {
            log.error("生成token出错",e);
        }
        return null;

    }
}
