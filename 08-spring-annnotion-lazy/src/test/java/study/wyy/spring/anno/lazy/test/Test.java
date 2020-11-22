package study.wyy.spring.anno.lazy.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.lazy.config.SpringConfig;
import study.wyy.spring.anno.lazy.service.AddressService;
import study.wyy.spring.anno.lazy.service.UserService;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 11:53 上午
 */
public class Test {
    @org.junit.Test
    public void test01(){
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        context.start();
        System.out.println("开始使用bean");
        UserService userService= context.getBean(UserService.class);
        AddressService addressService = context.getBean(AddressService.class);
    }
}
