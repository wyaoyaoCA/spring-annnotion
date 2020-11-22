package study.wyy.spring.anno.propertysource.spi;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;
import java.util.Properties;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 9:41 上午
 */
public class YamlPropertySourceFactory implements PropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        //参考spring的`DefaultPropertySourceFactory`实现，最终返回的就是一个PropertiesPropertySource
        // 也就是我们需要将yaml文件解析成Properties返回
        YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
        // 形参的这个EncodedResource类spring对Resource做了一层包装,从里面可以获取到Resource
        yamlPropertiesFactoryBean.setResources(resource.getResource());
        // 解析成Properties
        Properties properties = yamlPropertiesFactoryBean.getObject();
        return (name != null ? new PropertiesPropertySource(name, properties) :
                // 如果没有指定name就使用文件名作为name属性
                new PropertiesPropertySource(resource.getResource().getFilename(),properties));
    }
}
