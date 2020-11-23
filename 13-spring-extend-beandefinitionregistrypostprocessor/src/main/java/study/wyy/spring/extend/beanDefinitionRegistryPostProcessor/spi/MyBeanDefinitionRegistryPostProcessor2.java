package study.wyy.spring.extend.beanDefinitionRegistryPostProcessor.spi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;
import study.wyy.spring.extend.beanDefinitionRegistryPostProcessor.bean.LifeBean;

/**
 * @author wyaoyao
 * @data 2020-11-23 13:22
 * BeanFactory后置处理器：
 * BeanFactory标准初始化之后调用，此时所有的bean定义已经保存加载BeanFactory
 * 但是Bean的实例还未创建
 *
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor2 implements BeanDefinitionRegistryPostProcessor {


    /****
     * BeanDefinitionRegistryPostProcessor接口中定义的方法
     * @param registry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        int beanDefinitionCount = registry.getBeanDefinitionCount();
        System.out.println("MyBeanDefinitionRegistryPostProcessor => postProcessBeanDefinitionRegistry bean的数量: " + beanDefinitionCount);
        // 注册一个bean
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(LifeBean.class);
        // 设置为单例
        rootBeanDefinition.setScope("singleton");
        // 设置initMethodName
        //rootBeanDefinition.setInitMethodName();
        // 可见之前通过注解设置的bean的特点，都可以在这进行设置
        registry.registerBeanDefinition("lifeBean",rootBeanDefinition);
    }

    /****
     * BeanFactoryPostProcessor接口中定义的方法
     * BeanFactory标准初始化之后调用，此时所有的bean定义已经保存加载BeanFactory
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        System.out.println("MyBeanDefinitionRegistryPostProcessor => postProcessBeanFactory bean 的数量： " + beanDefinitionCount);
    }
}
