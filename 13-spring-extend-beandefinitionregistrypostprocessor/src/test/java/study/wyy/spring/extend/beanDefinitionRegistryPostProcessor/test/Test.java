package study.wyy.spring.extend.beanDefinitionRegistryPostProcessor.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.extend.beanDefinitionRegistryPostProcessor.bean.LifeBean;
import study.wyy.spring.extend.beanDefinitionRegistryPostProcessor.config.SpringConfig;
import study.wyy.spring.extend.beanDefinitionRegistryPostProcessor.config.SpringConfig1;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 9:23 下午
 */
public class Test {

    @org.junit.Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

    @org.junit.Test
    public void test02(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig1.class);
        LifeBean lifeBean = context.getBean("lifeBean", LifeBean.class);
        context.close();
    }
}
