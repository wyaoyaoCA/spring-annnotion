package study.wyy.spring.anno.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.anno.common.model.Person;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/16 7:40 下午
 */
@Configuration
public class SpringConfig2 {

    @Bean(value = "T-MAC")
    public Person person(){
        return new Person("T-Mac",20);
    }

}
