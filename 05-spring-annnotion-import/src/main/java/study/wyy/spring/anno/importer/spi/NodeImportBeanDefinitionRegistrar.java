package study.wyy.spring.anno.importer.spi;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Properties;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/21 8:08 下午
 */
public class NodeImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    private String[] basePackages;

    public NodeImportBeanDefinitionRegistrar() {
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties("application.properties");
            String basePackagesStr = properties.getProperty("node.scan.packages");
            basePackages = basePackagesStr.split(",");
            for(String basePackage: basePackages){
                System.out.println("扫描路径：" + basePackage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 创建类路径扫描器
        // 指定不使用默认的过滤规则：之前说明默认的过滤规则就是扫描@Service，@Component等4个注解
        // 这里使用我们自己定义的过滤规则，只扫描Node注解
        ClassPathBeanDefinitionScanner scanner =new ClassPathBeanDefinitionScanner(registry,false);
        // 指定自定义扫描器
        TypeFilter typeFilter = new CustomerNodeFilter();
        scanner.addIncludeFilter(typeFilter);
        // 扫描指定的包
        scanner.scan(basePackages);

    }
}
