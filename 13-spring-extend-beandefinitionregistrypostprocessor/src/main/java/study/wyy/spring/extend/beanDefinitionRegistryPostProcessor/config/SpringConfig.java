package study.wyy.spring.extend.beanDefinitionRegistryPostProcessor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.extend.beanDefinitionRegistryPostProcessor.spi.MyBeanDefinitionRegistryPostProcessor;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 9:14 下午
 */
@Configuration
public class SpringConfig {
    @Bean
    public static MyBeanDefinitionRegistryPostProcessor myBeanDefinitionRegistryPostProcessor(){
        return new MyBeanDefinitionRegistryPostProcessor();
    }

}
