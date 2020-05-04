package top.codekiller.auth.properties;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import top.codekiller.auth.util.RsaUtils;
import javax.annotation.PostConstruct;
import java.io.File;
import java.security.PrivateKey;
import java.security.PublicKey;


/**application.yml配置
 * leyou:
 *   jwt:
 *     secret: ea61b46dse2@leyou@9ds966@leyou@33da # 登录校验的密钥
 *     pubKeyPath: E:\\知识学习\\乐优商城-11月版\\leyou\\day17-授权中心\\rsa.pub # 公钥地址
 *     priKeyPath: E:\\知识学习\\乐优商城-11月版\\leyou\\day17-授权中心\\rsa.pub # 私钥地址
 *     expire: 30 # 过期时间,单位分钟
 *     cookieName: LY_TOKEN
 */


@ConfigurationProperties(prefix = "leyou.jwt")
@Slf4j
@Data
public class JwtProperties {

    private String secret; // 密钥

    private String pubKeyPath;// 公钥保存路径

    private String priKeyPath;// 私钥保存路径

    private int expire;// token过期时间

    private PublicKey publicKey; // 公钥

    private PrivateKey privateKey; // 私钥

    private String cookieName;  //cookie的名字

    /**
     * @PostContruct：在构造方法执行之后执行该方法
     */
    @PostConstruct
    public void init(){
        try {
            File pubKey = new File(pubKeyPath);
            File priKey = new File(priKeyPath);
            if (!pubKey.exists() || !priKey.exists()) {
                // 生成公钥和私钥
                RsaUtils.generateKey(pubKeyPath, priKeyPath, secret);
            }
            // 获取公钥和私钥
            this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
            this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
        } catch (Exception e) {
            log.error("初始化公钥和私钥失败！", e);
            throw new RuntimeException();
        }
        }
}

