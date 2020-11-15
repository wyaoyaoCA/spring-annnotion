package study.wyy.spring.anno.componentscan.service;

import org.springframework.stereotype.Component;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/14 9:27 下午
 */
@Component
public class UserService {
    public void sayHello(){
        System.out.println("Hello World");
    }
}
