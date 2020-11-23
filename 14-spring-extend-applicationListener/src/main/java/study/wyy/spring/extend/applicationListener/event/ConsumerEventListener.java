package study.wyy.spring.extend.applicationListener.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:26 下午
 */
public class ConsumerEventListener {

    @EventListener(classes = {ConsumerEvent.class})
    public void listen(ConsumerEvent event){
        System.out.println("收到事件：" + event.getSource());
    }
}
