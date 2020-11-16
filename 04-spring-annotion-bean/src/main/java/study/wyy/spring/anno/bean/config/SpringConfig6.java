package study.wyy.spring.anno.bean.config;

import jdk.nashorn.internal.ir.CallNode;
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
public class SpringConfig6 {


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Department department() {
        Person person = new Person("T-Mac", 20);
        Department department = new Department(person);
        return department;
    }

}
