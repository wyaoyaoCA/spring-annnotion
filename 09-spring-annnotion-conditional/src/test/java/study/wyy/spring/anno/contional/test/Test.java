package study.wyy.spring.anno.contional.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.common.model.Person;
import study.wyy.spring.anno.contional.config.SpringConfig;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 7:25 下午
 */
public class Test {

    @org.junit.Test
    public void test01(){
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        Person admin = context.getBean(Person.class);
        System.out.println(admin);
    }
}
