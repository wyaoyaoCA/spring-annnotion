package study.wyy.spring.annotion.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/6 11:18 上午
 */
@ComponentScan("study.wyy.spring.annotion.aop")
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
public class AopConfig2 {
}
