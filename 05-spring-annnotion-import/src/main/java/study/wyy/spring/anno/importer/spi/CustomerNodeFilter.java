package study.wyy.spring.anno.importer.spi;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import study.wyy.spring.anno.importer.anno.Node;

import java.io.IOException;
import java.util.Set;

/**
 * @author wyaoyao
 * @data 2020-11-19 22:50
 */
public class CustomerNodeFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取扫描到类上的注解类型
        Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();
        // 获取Node注解的全类名
        String canonicalName = Node.class.getCanonicalName();
        if (annotationTypes != null && annotationTypes.size() >= 1) {
            if(annotationTypes.contains(canonicalName)){
                // 如果扫描的类上包含Node注解，表示match 成功返回true
                return true;
            }
        }
        return false;
    }

}
