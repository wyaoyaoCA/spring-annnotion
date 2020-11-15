package study.wyy.spring.anno.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.componentscan.config.*;
import study.wyy.spring.anno.componentscan.service.AddressService;
import study.wyy.spring.anno.componentscan.service.UserService;
import study.wyy.spring.anno.componentscan.service.dao.UserDao;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/14 9:34 下午
 */
public class Test {

    @org.junit.Test
    public void test1(){
        // 1 加载配置类
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.sayHello();

    }

    @org.junit.Test
    public void test2(){
        // 1 加载配置类
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig1.class);
        UserService userService = context.getBean(UserService.class);
        userService.sayHello();
        AddressService addressService = context.getBean(AddressService.class);
        addressService.address();
        UserDao userDao = context.getBean(UserDao.class);
        userDao.saveUser();

    }

    @org.junit.Test
    public void test3(){
        // 1 加载配置类
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig2.class);
        UserService userService = context.getBean(UserService.class);
        userService.sayHello();
        AddressService addressService = context.getBean(AddressService.class);
        addressService.address();
        UserDao userDao = context.getBean(UserDao.class);
        userDao.saveUser();

    }

    @org.junit.Test
    public void test4(){
        // 1 加载配置类
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig3.class);
        SpringConfig3 helloSpringConfig3 = context.getBean("helloSpringConfig3",SpringConfig3.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.sayHello();

    }

    @org.junit.Test
    public void test5(){
        // 1 加载配置类
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig4.class);
        // 这里我们还是指定了value属性，依然以指定的name为准
        SpringConfig4 helloSpringConfig4 = context.getBean("helloSpringConfig4",SpringConfig4.class);
        UserService userService = context.getBean("consumer_userService", UserService.class);
        userService.sayHello();
        // 默认的首字母小写已经会找不到了NoSuchBeanDefinitionException
        UserService userService2 = context.getBean("userService", UserService.class);
        userService.sayHello();

    }
}
