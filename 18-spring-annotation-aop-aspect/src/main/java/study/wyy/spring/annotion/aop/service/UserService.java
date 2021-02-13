package study.wyy.spring.annotion.aop.service;

import study.wyy.spring.annotion.aop.model.User;

import java.util.List;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/6 11:16 上午
 */
public interface UserService {

     void save(User user);


     void batchSave(List<User> userList);
}
