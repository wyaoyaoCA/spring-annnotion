package study.wyy.spring.anno.aop.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import study.wyy.spring.anno.aop.model.User;
import study.wyy.spring.anno.aop.service.UserService;

import java.util.UUID;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 15:57
 * @description:
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public User save(User user) {
        String uuid = UUID.randomUUID().toString();
        user.setId(uuid);
        log.info("模拟保存用户。。。。。");
        return user;
    }

    @Override
    public Boolean update(User user) {
        String id = user.getId();
        if(null == id || id.length() ==0){
            throw new RuntimeException("user.id.not.null");
        }
        log.info("模拟更新用户。。。。。");
        return Boolean.TRUE;
    }
}
