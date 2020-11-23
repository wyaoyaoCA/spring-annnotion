package study.wyy.spring.extend.applicationListener.spi;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:06 下午
 */
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("收到事件: " + event);

    }
}
