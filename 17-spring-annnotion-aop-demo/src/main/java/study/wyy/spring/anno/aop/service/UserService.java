package study.wyy.spring.anno.aop.service;

import study.wyy.spring.anno.aop.model.User;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 15:36
 * @description:
 */
public interface UserService {

    public User save(User user);

    public Boolean update(User user);
}
