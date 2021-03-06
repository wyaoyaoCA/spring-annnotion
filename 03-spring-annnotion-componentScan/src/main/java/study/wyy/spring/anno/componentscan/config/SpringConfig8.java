package study.wyy.spring.anno.componentscan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import study.wyy.spring.anno.componentscan.anno.Node;
import study.wyy.spring.anno.componentscan.spi.MyTypeFilter;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/14 9:33 下午
 */
@Configuration
@ComponentScan(
        basePackages = {"study.wyy.spring.anno.componentscan.service"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM,value = {MyTypeFilter.class})}
)
public class SpringConfig8 {
}
