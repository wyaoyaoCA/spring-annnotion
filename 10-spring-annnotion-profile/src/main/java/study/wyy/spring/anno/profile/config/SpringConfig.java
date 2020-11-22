package study.wyy.spring.anno.profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import study.wyy.spring.anno.common.model.Person;


/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 7:23 下午
 */
@Configuration
public class SpringConfig {

    @Bean("devAdmin")
    @Profile("dev")
    public Person windowsAdmin(){
        return new Person("devAdmin",18);
    }

    @Bean("testAdmin")
    @Profile("test")
    public Person macAdmin(){
        return new Person("testAdmin",18);
    }

    @Bean("prodAdmin")
    @Profile("prod")
    public Person linuxAdmin(){
        return new Person("prodAdmin",18);
    }
}
