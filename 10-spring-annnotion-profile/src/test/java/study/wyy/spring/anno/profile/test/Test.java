package study.wyy.spring.anno.profile.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import study.wyy.spring.anno.common.model.Person;
import study.wyy.spring.anno.profile.config.SpringConfig;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 8:31 下午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@ActiveProfiles("test")
public class Test {

    @Autowired
    Person person;

    @org.junit.Test
    public void test01(){
        System.out.println(person);
    }
}
