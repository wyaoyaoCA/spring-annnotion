package study.wyy.spring.anno.life.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.anno.life.bean.LifeBean4;

/**
 * @author wyaoyao
 * @data 2020-11-23 07:51
 */
@Configuration
public class SpringConfig5 {


    @Bean(initMethod = "init",destroyMethod = "destroyOnBean")
    public LifeBean4 lifeBean(){
        return new LifeBean4();
    }
}
