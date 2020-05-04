package top.codekiller.leyou.interceptor;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import top.codekiller.auth.pojo.UserInfo;
import top.codekiller.auth.util.CookieUtils;
import top.codekiller.auth.util.JwtUtils;
import top.codekiller.leyou.properties.JwtProperties;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@EnableConfigurationProperties(JwtProperties.class)
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

    private static final ThreadLocal<UserInfo> THREAD_LOCAL=new ThreadLocal<>();

    private JwtProperties jwtProperties;

    public LoginInterceptor(JwtProperties jwtProperties){
        this.jwtProperties=jwtProperties;
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取cookie中的cookie
        String token = CookieUtils.getCookieValue(request, this.jwtProperties.getCookieName());

        //解析token，获取用户信息
        UserInfo userInfo = JwtUtils.getInfoFromToken(token, this.jwtProperties.getPublicKey());
        if(userInfo==null){
            return false;
        }

        //把userInfo放入线程局部变量中
        THREAD_LOCAL.set(userInfo);

        return true;
    }

    public static UserInfo getUserInfo(){
        return THREAD_LOCAL.get();
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //清空线程的局部变量.因为使用的是tomcat的线程池，线程不会结束，也就不会释放线程的局部变量
        THREAD_LOCAL.remove();

    }
}
