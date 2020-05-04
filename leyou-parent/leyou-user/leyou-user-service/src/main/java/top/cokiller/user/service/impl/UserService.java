package top.cokiller.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.leyou.common.utils.NumberUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.codekiller.user.pojo.User;
import top.cokiller.user.mapper.UserMapper;
import top.cokiller.user.service.IUserService;
import top.cokiller.user.utils.CodecUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private StringRedisTemplate redisTemplate;

    private static final String KEY_PREFIX="user:verify";


    /**
     * 校验数据是否可用
     * @param data
     * @param type
     * @return
     */
    @Override
    public Boolean checkUser(String data, Integer type) {
        //用户名验证
        if(type==1) {
            return this.userMapper.selectCount(new QueryWrapper<User>().lambda()
                    .eq(User::getUsername,data))==0;
        }//短信验证
        else if(type==2){
           return  this.userMapper.selectCount(new QueryWrapper<User>().lambda()
                    .eq(User::getPhone,data))==0;
        }

        return null;
    }


    /**
     * 发送验证码
     * @param phone
     */
    @Override
    public Boolean sendVerifyCode(String phone) {
        //校验手机号格式是否正确
        if (!phone.matches("^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$")) {
            return false;
        }

        if(StringUtils.isBlank(phone)){
            return false;
        }
        //生成验证码
        String code= NumberUtils.generateCode(6);
        System.out.println("验证码："+code);

        //获取数据
        Map<String,String> map=new HashMap<>();
        map.put("phone",phone);
        map.put("code",code);
        try {
            //发送消息到RabbitMQ
//            amqpTemplate.convertAndSend("LEYOU.SMS.EXCHANGE","verifycode.sms",map);
            System.out.println(code);
            //把验证码保存到redis中,并且设置5min的有效时间
            this.redisTemplate.opsForValue().set(KEY_PREFIX+phone,code,5, TimeUnit.MINUTES);
        } catch (AmqpException e) {
            log.error("给{}发送验证码失败", phone, e);
            e.printStackTrace();
            return null;
        }
        return true;
    }

    /**
     * 用户注册
     * @param user
     * @param code
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void register(User user, String code) {

        //获取验证码
        String rediscode = this.redisTemplate.opsForValue().get(KEY_PREFIX + user.getPhone());
        //校验验证码
        if(!StringUtils.equals(code,rediscode)){
            return ;
        }
        //生成盐
        String salt = CodecUtils.generateSalt();
        user.setSalt(salt);

        //加盐加密
        String password = CodecUtils.md5Hex(user.getPassword(), salt);
        user.setPassword(password);

        //新增用户
        user.setId(null);
        user.setCreated(new Date());
        this.userMapper.insert(user);

    }

    @Override
    public User queryUser(String username, String password) {
        //根据用户名查询用户
        User user=this.userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getUsername,username));
        //没有此用户直接返回
        if(user==null) return null;

        //获取盐
        String salt=user.getSalt();

        //对需要验证的password进行加盐加密
        password=CodecUtils.md5Hex(password,salt);

        //校验密码是否一致
        if(StringUtils.equals(password,user.getPassword())){
            return user;
        }else{
            return null;
        }
    }
}
