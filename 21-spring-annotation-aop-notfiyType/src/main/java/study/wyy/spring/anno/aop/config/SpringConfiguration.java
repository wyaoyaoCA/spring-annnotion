package study.wyy.spring.anno.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wyaoyao
 * @description
 * @date 2021/2/1 16:25
 */
@Configuration
@ComponentScan("study.wyy.spring.anno.aop")
@EnableAspectJAutoProxy(exposeProxy = true) // 开启AspectJ
public class SpringConfiguration {
}
