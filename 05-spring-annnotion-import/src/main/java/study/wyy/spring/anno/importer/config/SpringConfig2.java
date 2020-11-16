package study.wyy.spring.anno.importer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.anno.common.model.Department;
import study.wyy.spring.anno.common.model.Person;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/17 7:17 上午
 */
@Configuration
public class SpringConfig2 {

    @Bean
    public Person person(){
        return new Person("wyy",19);
    }
}
