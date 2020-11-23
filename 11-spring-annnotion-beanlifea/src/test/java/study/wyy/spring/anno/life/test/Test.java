package study.wyy.spring.anno.life.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.life.bean.LifeBean;
import study.wyy.spring.anno.life.bean.LifeBean2;
import study.wyy.spring.anno.life.bean.LifeBean3;
import study.wyy.spring.anno.life.bean.LifeBean4;
import study.wyy.spring.anno.life.config.*;

/**
 * @author wyaoyao
 * @data 2020-11-23 07:54
 */
public class Test {

    @org.junit.Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println("ioc容器创建完成");
        context.close();
    }


    @org.junit.Test
    public void test02(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig1.class);
        System.out.println("ioc容器创建完成");
        context.close();
    }

    @org.junit.Test
    public void test03(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig1.class);
        System.out.println("ioc容器创建完成");
        LifeBean bean = context.getBean(LifeBean.class);
        context.close();
    }


    @org.junit.Test
    public void test04(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig2.class);
        System.out.println("ioc容器创建完成");
        context.close();
    }


    @org.junit.Test
    public void test05(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig3.class);
        System.out.println("ioc容器创建完成");
        LifeBean2 bean = context.getBean(LifeBean2.class);
        context.close();
    }


    @org.junit.Test
    public void test06(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig4.class);
        System.out.println("ioc容器创建完成");
        LifeBean3 bean = context.getBean(LifeBean3.class);
        context.close();
    }

    @org.junit.Test
    public void test07(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig5.class);
        System.out.println("ioc容器创建完成");
        LifeBean4 bean = context.getBean(LifeBean4.class);
        context.close();
    }


    @org.junit.Test
    public void test08(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig6.class);
        System.out.println("ioc容器创建完成");
        LifeBean4 bean = context.getBean(LifeBean4.class);
        context.close();
    }


}
