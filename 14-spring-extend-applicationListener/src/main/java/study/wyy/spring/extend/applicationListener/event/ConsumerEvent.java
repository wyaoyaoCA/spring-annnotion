package study.wyy.spring.extend.applicationListener.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:17 下午
 */
public class ConsumerEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public ConsumerEvent(Object source) {
        super(source);
    }


}
