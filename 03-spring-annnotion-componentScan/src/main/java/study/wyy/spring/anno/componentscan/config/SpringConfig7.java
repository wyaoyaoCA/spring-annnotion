package study.wyy.spring.anno.componentscan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
import study.wyy.spring.anno.componentscan.anno.Node;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/14 9:33 下午
 */
@Configuration
@ComponentScan(
        basePackages = {"study.wyy.spring.anno.componentscan.service"},
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Node.class})}
)
public class SpringConfig7 {
}
