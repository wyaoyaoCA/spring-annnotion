package study.wyy.spring.anno.aop.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import study.wyy.spring.anno.aop.model.User;
import study.wyy.spring.anno.aop.service.UserService;

import java.util.List;
import java.util.UUID;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 15:57
 * @description:
 */
@Service
@Slf4j
public final class UserServiceImpl implements UserService {
    @Override
    public User save(User user) {
        if(null == user){
           throw new IllegalArgumentException("user.is.null");
        }
        System.out.println("模拟保存");
        return user;
    }

    public static void main(String[] args) {
        try {
            System.out.println("前置通知");
            System.out.println("切入点方法");
            System.out.println("后置通知");
        }catch (Exception e){
            System.out.println("异常通知");
        }finally {
            System.out.println("最终通知");
        }
    }

}
