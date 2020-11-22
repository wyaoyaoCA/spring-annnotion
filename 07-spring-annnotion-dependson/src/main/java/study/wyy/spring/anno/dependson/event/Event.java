package study.wyy.spring.anno.dependson.event;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 11:31 上午
 */
@Component
@DependsOn("eventListener")
public class Event {

    public Event() {
        System.out.println("Event事件 创建了");
    }
}
