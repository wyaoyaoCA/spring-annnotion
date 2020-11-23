package study.wyy.spring.extend.smartInitializingSingleton.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.extend.smartInitializingSingleton.config.SpringConfig;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:43 下午
 */
public class Test {


    @org.junit.Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.close();
    }

}
