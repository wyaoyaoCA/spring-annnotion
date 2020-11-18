package study.wyy.spring.anno.importer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import study.wyy.spring.anno.importer.spi.CustomerImportSelector;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/17 7:17 上午
 */
@Configuration
@Import(CustomerImportSelector.class)
public class SpringConfig3 {


}
