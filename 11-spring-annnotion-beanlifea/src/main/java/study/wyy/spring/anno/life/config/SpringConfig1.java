package study.wyy.spring.anno.life.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import study.wyy.spring.anno.life.bean.LifeBean;

/**
 * @author wyaoyao
 * @data 2020-11-23 07:51
 */
@Configuration
public class SpringConfig1 {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Scope("prototype")
    public LifeBean lifeBean(){
        return new LifeBean();
    }
}
