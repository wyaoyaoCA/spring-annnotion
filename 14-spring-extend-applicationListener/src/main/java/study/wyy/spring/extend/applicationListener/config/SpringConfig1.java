package study.wyy.spring.extend.applicationListener.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.extend.applicationListener.spi.MyApplicationListener;
import study.wyy.spring.extend.applicationListener.spi.MyApplicationListener2;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:08 下午
 */
@Configuration
public class SpringConfig1 {

    @Bean
    public ApplicationListener myApplicationListener(){
        return new MyApplicationListener2();
    }
}
