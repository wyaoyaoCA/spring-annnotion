package study.wyy.spring.anno.bean.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.anno.common.model.Department;
import study.wyy.spring.anno.common.model.Person;

import javax.annotation.Resource;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/16 7:40 下午
 */
@Configuration
public class SpringConfig5 {


    @Resource
    Person person;

    @Bean(autowireCandidate = false)
    public Person person(){
        return new Person("T-Mac",20);
    }
    @Bean
    public Department department(){
        return new Department(person);
    }
}
