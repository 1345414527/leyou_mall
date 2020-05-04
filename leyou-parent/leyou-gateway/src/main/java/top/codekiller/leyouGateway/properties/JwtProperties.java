package top.codekiller.leyouGateway.properties;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import top.codekiller.auth.util.RsaUtils;
import javax.annotation.PostConstruct;
import java.security.PublicKey;
import java.util.List;


@ConfigurationProperties(prefix = "leyou.jwt")
@Slf4j
@Data
public class JwtProperties {

    private String pubKeyPath;// 公钥保存路径

    private PublicKey publicKey; // 公钥


    private String cookieName;  //cookie的名字



    /**
     * @PostContruct：在构造方法执行之后执行该方法
     */
    @PostConstruct
    public void init() {
        // 获取公钥和私钥
        try {
            this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        } catch (Exception e) {
            log.error("Zuul获取公钥异常",e);
        }
    }
}

