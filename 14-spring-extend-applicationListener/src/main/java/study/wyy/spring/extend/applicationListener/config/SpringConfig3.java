package study.wyy.spring.extend.applicationListener.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.extend.applicationListener.event.ConsumerEventListener;
import study.wyy.spring.extend.applicationListener.spi.MyApplicationListener3;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:08 下午
 */
@Configuration
public class SpringConfig3 {

    @Bean
    public ConsumerEventListener consumerEventListener(){
        return new ConsumerEventListener();
    }
}
