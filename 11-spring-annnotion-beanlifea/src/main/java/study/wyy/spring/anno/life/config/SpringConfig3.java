package study.wyy.spring.anno.life.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import study.wyy.spring.anno.life.bean.LifeBean2;

/**
 * @author wyaoyao
 * @data 2020-11-23 07:51
 */
@Configuration
public class SpringConfig3 {


    @Bean
    @Scope("prototype")
    public LifeBean2 lifeBean(){
        return new LifeBean2();
    }
}
