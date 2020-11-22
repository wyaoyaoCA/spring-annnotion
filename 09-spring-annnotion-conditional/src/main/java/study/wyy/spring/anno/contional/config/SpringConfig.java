package study.wyy.spring.anno.contional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.anno.common.model.Person;
import study.wyy.spring.anno.contional.spi.LinuxConditional;
import study.wyy.spring.anno.contional.spi.MacConditional;
import study.wyy.spring.anno.contional.spi.WindowsConditional;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 7:23 下午
 */
@Configuration
public class SpringConfig {

    @Bean("windowsAdmin")
    @Conditional(value = WindowsConditional.class)
    public Person windowsAdmin(){
        return new Person("windowsAdmin",18);
    }

    @Bean("macAdmin")
    @Conditional(value = MacConditional.class)
    public Person macAdmin(){
        return new Person("macAdmin",18);
    }

    @Bean("linuxAdmin")
    @Conditional(value = LinuxConditional.class)
    public Person linuxAdmin(){
        return new Person("linuxAdmin",18);
    }
}
