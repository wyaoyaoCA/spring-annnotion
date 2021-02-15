package study.wyy.spring.anno.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author by wyaoyao
 * @Description spring的配置类，替代的就是applicationContext.xml
 * @Date 2021/2/13 10:12 下午
 */
@Configuration
// 这个包扫描就不要扫描controller,controller的扫描交给spring mvc的配置类*/
@ComponentScan("study.wyy.spring.anno.service")
public class ApplicationContextConfiguration {

}

