package study.wyy.spring.anno.dependson.event;

import org.springframework.stereotype.Component;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 11:31 上午
 */
@Component
public class EventListener {

    public EventListener() {
        System.out.println("EventListener 创建了。。。");
    }
}
