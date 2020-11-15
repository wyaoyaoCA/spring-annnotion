package study.wyy.spring.anno.componentscan.service.dao;

import org.springframework.stereotype.Repository;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/14 10:26 下午
 */
@Repository
public class UserDao {
    public void saveUser(){
        System.out.println("save user");
    }
}
