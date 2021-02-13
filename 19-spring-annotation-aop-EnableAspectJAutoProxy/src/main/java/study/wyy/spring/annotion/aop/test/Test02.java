package study.wyy.spring.annotion.aop.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.annotion.aop.config.AopConfig1;
import study.wyy.spring.annotion.aop.config.AopConfig2;
import study.wyy.spring.annotion.aop.model.User;
import study.wyy.spring.annotion.aop.service.UserService;

import java.util.Arrays;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/6 11:20 上午
 */
public class Test02 {

    public static void main(String[] args) {
        // 1 获取容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AopConfig2.class);
        //2.获取bean对象
        UserService userService = ac.getBean(UserService.class);
        System.out.println(userService);
        // 3.准备数据
        User user = new User();
        user.setId("1");
        user.setUsername("test");
        user.setNickname("泰斯特");
        userService.batchSave(Arrays.asList(user));
    }
}
