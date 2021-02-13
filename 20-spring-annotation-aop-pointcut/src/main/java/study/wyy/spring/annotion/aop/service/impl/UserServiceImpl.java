package study.wyy.spring.annotion.aop.service.impl;

import org.springframework.stereotype.Service;
import study.wyy.spring.annotion.aop.model.User;
import study.wyy.spring.annotion.aop.service.UserService;


/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/6 11:16 上午
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("模拟保存用户");
    }

}
