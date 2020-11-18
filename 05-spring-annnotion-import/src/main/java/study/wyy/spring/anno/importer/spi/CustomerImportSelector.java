package study.wyy.spring.anno.importer.spi;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * @author wyaoyao
 * @data 2020-11-18 08:28
 */
public class CustomerImportSelector implements ImportSelector {
    /**
     *
     * @param importingClassMetadata 类的注解信息
     * @return 返回需要到导入组件的全类名数组
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 获取类（Import注解所在的类）上的注解类型
        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
        System.out.println("getAnnotationTypes :" + annotationTypes);
        String className = importingClassMetadata.getClassName();
        System.out.println("getClassName :" + className);
        // 返回ItemService和StoreService的全限类名
        return new String[]{"study.wyy.spring.anno.importer.service.ItemService","study.wyy.spring.anno.importer.service.StoreService"};
    }
}
