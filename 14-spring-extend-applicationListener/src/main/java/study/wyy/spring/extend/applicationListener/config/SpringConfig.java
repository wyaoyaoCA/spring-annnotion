package study.wyy.spring.extend.applicationListener.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.extend.applicationListener.spi.MyApplicationListener;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:08 下午
 */
@Configuration
public class SpringConfig {

    @Bean
    public ApplicationListener myApplicationListener(){
        return new MyApplicationListener();
    }
}
