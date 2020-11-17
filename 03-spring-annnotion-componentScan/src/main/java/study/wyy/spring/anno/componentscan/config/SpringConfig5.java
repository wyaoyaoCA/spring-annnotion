package study.wyy.spring.anno.componentscan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
import study.wyy.spring.anno.componentscan.spi.ConsumerBeanNameGenerator;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/14 9:33 下午
 */
@Configuration
@ComponentScan(
        basePackages = {"study.wyy.spring.anno.componentscan.service"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Repository.class})}
)
public class SpringConfig5 {
}
