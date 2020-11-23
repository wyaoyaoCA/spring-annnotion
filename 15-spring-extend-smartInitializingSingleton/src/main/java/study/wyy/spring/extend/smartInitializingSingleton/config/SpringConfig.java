package study.wyy.spring.extend.smartInitializingSingleton.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.extend.smartInitializingSingleton.bean.Bean1;
import study.wyy.spring.extend.smartInitializingSingleton.bean.Bean2;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:38 下午
 */
@Configuration
@ComponentScan("study.wyy.spring.extend.smartInitializingSingleton")
public class SpringConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Bean1 bean1(){
        return new Bean1();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Bean2 bean2(){
        return new Bean2();
    }
}
