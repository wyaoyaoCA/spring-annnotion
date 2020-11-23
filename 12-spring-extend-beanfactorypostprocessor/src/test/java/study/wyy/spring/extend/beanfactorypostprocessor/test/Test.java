package study.wyy.spring.extend.beanfactorypostprocessor.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.extend.beanfactorypostprocessor.config.SpringConfig;

/**
 * @author wyaoyao
 * @data 2020-11-23 13:45
 */

public class Test {

    @org.junit.Test
    public void test01(){
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
    }
}
