package study.wyy.spring.anno.aop.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.aop.config.SpringConfiguration;
import study.wyy.spring.anno.aop.model.User;
import study.wyy.spring.anno.aop.service.UserService;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/11 4:47 下午
 */
public class Test01 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        userService.save(new User());
        // 模拟异常
        //userService.save(null);
    }
}
