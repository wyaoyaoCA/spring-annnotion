package study.wyy.spring.anno.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.aop.config.SpringConfiguration;
import study.wyy.spring.anno.aop.model.User;
import study.wyy.spring.anno.aop.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author wyaoyao
 * @description
 * @date 2021/2/1 16:27
 */
public class SpringAOPTest2 {

    public static void main(String[] args) {
        // 1 获取容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //2.获取bean对象
        UserService userService = ac.getBean(UserService.class);
        // 3.准备数据
        User user = new User();
        user.setId("1");
        user.setUsername("test");
        user.setNickname("泰斯特");
        List list = Arrays.asList(user,user);
        userService.batchSave(list);

    }
}
