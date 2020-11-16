package study.wyy.spring.anno.bean.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.anno.common.model.Department;
import study.wyy.spring.anno.common.model.Person;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/16 7:40 下午
 */
@Configuration
public class SpringConfig3 {



    @Bean(autowireCandidate = true)
    public Person tMac(){
        return new Person("T-Mac",20);
    }
    @Bean(autowireCandidate = true)
    public Department department(@Autowired Person person){
        return new Department(person);
    }
}
