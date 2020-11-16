package study.wyy.spring.anno.importer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import study.wyy.spring.anno.common.model.Department;
import study.wyy.spring.anno.common.model.Person;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/17 7:17 上午
 */
@Configuration
@Import(SpringConfig2.class)
public class SpringConfig1 {

    @Bean
    public Department department(){
        return new Department(new Person("wyy",19));
    }
}
