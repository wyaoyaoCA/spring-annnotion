package study.wyy.spring.extend.applicationListener.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.extend.applicationListener.config.SpringConfig;
import study.wyy.spring.extend.applicationListener.config.SpringConfig1;
import study.wyy.spring.extend.applicationListener.config.SpringConfig2;
import study.wyy.spring.extend.applicationListener.config.SpringConfig3;
import study.wyy.spring.extend.applicationListener.event.ConsumerEvent;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:09 下午
 */
public class Test {

    @org.junit.Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.close();
    }

    @org.junit.Test
    public void test02(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig1.class);
        context.close();
    }


    @org.junit.Test
    public void test03(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig2.class);
        ConsumerEvent event = new ConsumerEvent("自定义事件");
        context.publishEvent(event);
        context.close();
    }

    @org.junit.Test
    public void test04(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig3.class);
        ConsumerEvent event = new ConsumerEvent("自定义事件。。。。");
        context.publishEvent(event);
        context.close();
    }
}
