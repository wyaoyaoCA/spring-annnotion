package study.wyy.spring.anno.componentscan.spi;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.beans.Introspector;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/15 2:10 下午
 * 自定义beanName生成
 * 这里不直接重写BeanNameGenerator接口，直接继承AnnotationBeanNameGenerator
 * 可以直接复用一些
 */
public class ConsumerBeanNameGenerator extends AnnotationBeanNameGenerator {


    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        // 为了明显这里重写generateBeanName，直接调用父类的
        // 当时我们要重写buildDefaultBeanName这个方法
      return super.generateBeanName(definition,registry);
    }

    @Override
    protected String buildDefaultBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        String beanClassName = definition.getBeanClassName();
        Assert.state(beanClassName != null, "No bean class name set");
        String shortClassName = ClassUtils.getShortName(beanClassName);
        String decapitalize = Introspector.decapitalize(shortClassName);
        // 到这还是之前的逻辑，我们就在返回结果上拼接一个consumer_
        return "consumer_" +decapitalize;
    }
}
