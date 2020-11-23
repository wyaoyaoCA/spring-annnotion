package study.wyy.spring.extend.beanDefinitionRegistryPostProcessor.spi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author wyaoyao
 * @data 2020-11-23 13:22
 * BeanFactory后置处理器：
 * BeanFactory标准初始化之后调用，此时所有的bean定义已经保存加载BeanFactory
 * 但是Bean的实例还未创建
 *
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


    /****
     * BeanDefinitionRegistryPostProcessor接口中定义的方法
     * @param registry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor => postProcessBeanDefinitionRegistry。。。。。");
    }

    /****
     * BeanFactoryPostProcessor接口中定义的方法
     * BeanFactory标准初始化之后调用，此时所有的bean定义已经保存加载BeanFactory
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor => postProcessBeanFactory。。。。。");
    }
}
