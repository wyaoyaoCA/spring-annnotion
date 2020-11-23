package study.wyy.spring.extend.applicationListener.spi;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import study.wyy.spring.extend.applicationListener.event.ConsumerEvent;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:06 下午
 */
public class MyApplicationListener3 implements ApplicationListener<ConsumerEvent> {
    @Override
    public void onApplicationEvent(ConsumerEvent event) {
        System.out.println("收到事件：" + event.getSource());
    }
}
