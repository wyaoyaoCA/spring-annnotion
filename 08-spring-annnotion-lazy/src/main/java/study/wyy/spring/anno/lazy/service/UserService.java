package study.wyy.spring.anno.lazy.service;

import org.springframework.stereotype.Component;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 11:46 上午
 */
@Component
public class UserService {

    public UserService() {
        System.out.println("UserService 创建。。。。。");
    }

    public void saveUser(){
        System.out.println("保存用户....");
    }
}
