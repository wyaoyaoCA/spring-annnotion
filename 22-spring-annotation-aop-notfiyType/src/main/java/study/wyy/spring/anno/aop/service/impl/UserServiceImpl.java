package study.wyy.spring.anno.aop.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import study.wyy.spring.anno.aop.model.User;
import study.wyy.spring.anno.aop.service.UserService;


/**
 * @author: wyaoyao
 * @date: 2020-12-24 15:57
 * @description:
 */
@Service
@Slf4j
public final class UserServiceImpl implements UserService {


    @Override
    public User save(User user,  String id) {
        if(id==null){
            throw new IllegalArgumentException("id.is.null");
        }
        user.setId(id);
        System.out.println("模拟保存用户");
        return user;
    }

    @Override
    public User save(String user,  String id) {
        if(id==null){
            throw new IllegalArgumentException("id.is.null");
        }

        System.out.println("模拟保存用户");
        return null;
    }


}
