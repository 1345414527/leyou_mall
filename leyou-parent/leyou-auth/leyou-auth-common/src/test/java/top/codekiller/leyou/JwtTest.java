package top.codekiller.leyou;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import top.codekiller.auth.pojo.UserInfo;
import top.codekiller.auth.util.JwtUtils;
import top.codekiller.auth.util.RsaUtils;

import java.security.PrivateKey;
import java.security.PublicKey;


public class JwtTest {

    /**
     * 存放公钥(yuè)的路径
     */
    private static final String pubKeyPath = "E:\\知识学习\\乐优商城-11月版\\leyou\\day17-授权中心\\rsa.pub";

    /**
     * 存放私钥(yuè)的路径
     */
    private static final String priKeyPath = "E:\\知识学习\\乐优商城-11月版\\leyou\\day17-授权中心\\rsa.pri";

    private PublicKey publicKey;

    private PrivateKey privateKey;

    @Test
    public void testRsa() throws Exception {
        //（公钥路径，私钥路径，服务密钥）
        RsaUtils.generateKey(pubKeyPath, priKeyPath, "234");
    }

    @Before
    public void testGetRsa() throws Exception {
        this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
    }

    @Test
    public void testGenerateToken() throws Exception {
        // 生成token
        String token = JwtUtils.generateToken(new UserInfo(20L, "jack"), privateKey, 5);
        System.out.println("token = " + token);
    }

    @Test
    public void testParseToken() throws Exception {
        String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6MjAsInVzZXJuYW1lIjoiamFjayIsImV4cCI6MTUzMzI4MjQ3N30.EPo35Vyg1IwZAtXvAx2TCWuOPnRwPclRNAM4ody5CHk8RF55wdfKKJxjeGh4H3zgruRed9mEOQzWy79iF1nGAnvbkraGlD6iM-9zDW8M1G9if4MX579Mv1x57lFewzEo-zKnPdFJgGlAPtNWDPv4iKvbKOk1-U7NUtRmMsF1Wcg";

        // 解析token
        UserInfo user = JwtUtils.getInfoFromToken(token, publicKey);
        System.out.println("id: " + user.getId());
        System.out.println("userName: " + user.getUsername());
    }
}
