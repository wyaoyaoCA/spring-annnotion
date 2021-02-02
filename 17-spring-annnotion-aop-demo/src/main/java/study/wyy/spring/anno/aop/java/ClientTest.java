package study.wyy.spring.anno.aop.java;

import study.wyy.spring.anno.aop.model.User;
import study.wyy.spring.anno.aop.service.UserService;

import java.util.Date;

/**
 * @author wyaoyao
 * @description
 * @date 2021/2/1 17:50
 */
public class ClientTest {
    public static void main(String[] args) {
        UserService userService = MyProxyBeanFactory.createUserService();
        User user = new User();
        user.setMobile("13100001111");
        user.setBirthday(new Date());
        user.setNickname("kobe");
        userService.save(user);
        user.setId(null);
        userService.update(user);

    }
}
