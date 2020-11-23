package study.wyy.spring.extend.beanfactorypostprocessor.config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.extend.beanfactorypostprocessor.bean.LifeBean;
import study.wyy.spring.extend.beanfactorypostprocessor.spi.MyBeanFactoryPostProcessor;

/**
 * @author wyaoyao
 * @data 2020-11-23 13:21
 */
@Configuration
public class SpringConfig {


    @Bean
    public LifeBean lifeBean(){
        return new LifeBean();
    }

    @Bean
    public BeanFactoryPostProcessor myMyBeanFactoryPostProcessor(){
        return new MyBeanFactoryPostProcessor();
    }
}
