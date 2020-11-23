package study.wyy.spring.extend.applicationListener.spi;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:06 下午
 */
public class MyApplicationListener2 implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
       if(event instanceof ContextRefreshedEvent){
           System.out.println("容器刷新时候要处理。。。。。。");
       }

        if(event instanceof ContextClosedEvent){
            // 容器关闭的时候处理
            System.out.println("容器关闭时候要处理。。。。。。");
        }

    }
}
