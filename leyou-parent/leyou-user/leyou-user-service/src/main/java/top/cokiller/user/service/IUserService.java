package top.cokiller.user.service;

import top.codekiller.user.pojo.User;

public interface IUserService {

    /**
     * 校验数据是否可用
     * @param data
     * @param type
     * @return
     */
    Boolean checkUser(String data, Integer type);

    /**
     * 发送验证码
     * @param phone
     */
    Boolean sendVerifyCode(String phone);

    /**
     * 用户注册
     * @param user
     * @param code
     */
    void register(User user, String code);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    User queryUser(String username, String password);
}
