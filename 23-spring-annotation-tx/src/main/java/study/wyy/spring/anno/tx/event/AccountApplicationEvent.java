package study.wyy.spring.anno.tx.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/13 8:35 下午
 */
public class AccountApplicationEvent extends ApplicationEvent {


    public AccountApplicationEvent(Object source) {
        super(source);
    }
}
