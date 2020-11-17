package study.wyy.spring.anno.componentscan.spi;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/17 10:19 下午
 * 只扫描类名包含User的
 */
public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取当前类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前类资源（类路径）
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        // 类名包含User，匹配成功
        if(className.contains("User")){
            return true;
        }
        return false;
    }
}
