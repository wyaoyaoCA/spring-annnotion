package study.wyy.spring.annotion.aop.service.impl;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import study.wyy.spring.annotion.aop.model.User;
import study.wyy.spring.annotion.aop.service.UserService;

import java.util.List;

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


    @Override
    public void batchSave(List<User> userList) {
        // 实现，内部调用的就是save方法
        for (User user : userList) {
            // 获取代理对象
            UserService userService = (UserService) AopContext.currentProxy();
            userService.save(user);
            //save(user);
        }
    }
}
