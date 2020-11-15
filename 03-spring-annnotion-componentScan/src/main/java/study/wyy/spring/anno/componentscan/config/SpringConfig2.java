package study.wyy.spring.anno.componentscan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import study.wyy.spring.anno.componentscan.service.UserService;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/14 9:33 下午
 */
@Configuration
@ComponentScan(
        basePackages = {"study.wyy.spring.anno.componentscan.service"},
        resourcePattern = "*.class"
)
public class SpringConfig2 {
}
