package study.wyy.spring.anno.rumen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.anno.common.model.Person;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/12 9:25 下午
 */
@Configuration
public class SpringConfig {
    @Bean
    public Person person(){
        return new Person("Kobe",20);
    }
}
