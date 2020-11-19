package study.wyy.spring.anno.importer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import study.wyy.spring.anno.importer.spi.CustomerImportSelector;
import study.wyy.spring.anno.importer.spi.NodeImportSelector;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/17 7:17 上午
 */
@Configuration
@Import(NodeImportSelector.class)
public class SpringConfig4 {


}
