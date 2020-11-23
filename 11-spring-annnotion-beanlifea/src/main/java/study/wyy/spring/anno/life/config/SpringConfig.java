package study.wyy.spring.anno.life.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.anno.life.bean.LifeBean;

/**
 * @author wyaoyao
 * @data 2020-11-23 07:51
 */
@Configuration
public class SpringConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public LifeBean lifeBean(){
        return new LifeBean();
    }
}
