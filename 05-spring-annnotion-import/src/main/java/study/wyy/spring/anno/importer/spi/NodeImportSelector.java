package study.wyy.spring.anno.importer.spi;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * @author wyaoyao
 * @data 2020-11-18 08:28
 */
public class NodeImportSelector implements ImportSelector {


    private String[] basePackages;

    public NodeImportSelector() {
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

    /**
     * 需求：
     * 扫描指定包下的Node注解
     * @param importingClassMetadata
     * @return
     */


    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        // 创建类路径扫描器
        // 指定不使用默认的过滤规则：之前说明默认的过滤规则就是扫描@Service，@Component等4个注解
        // 这里使用我们自己定义的过滤规则，只扫描Node注解
        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
        // 指定自定义扫描器
        TypeFilter typeFilter = new CustomerNodeFilter();
        scanner.addIncludeFilter(typeFilter);
        // 定义要扫描的类的全限定类型
        Set<String> classes = new HashSet<>();
        // 扫描指定的包
        for (String basePackage:basePackages) {
            Set<BeanDefinition> candidateComponents = scanner.findCandidateComponents(basePackage);
            candidateComponents.forEach(i->classes.add(i.getBeanClassName()));
        }
        // 返回要扫描的类的全限定类型
        return classes.toArray(new String[classes.size()]);
    }
}
