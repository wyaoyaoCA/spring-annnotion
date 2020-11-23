package study.wyy.spring.extend.beanfactorypostprocessor.spi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author wyaoyao
 * @data 2020-11-23 13:22
 * BeanFactory后置处理器：
 * BeanFactory标准初始化之后调用，此时所有的bean定义已经保存加载BeanFactory
 * 但是Bean的实例还未创建
 *
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    /***
     *
     * @param configurableListableBeanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor: postProcessBeanFactory");
        // 获取bean定义的数量
        int count = configurableListableBeanFactory.getBeanDefinitionCount();
        // 获取bean定义的名字
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        System.out.println("当前BeanFactory中有"+count+"个bean");
        System.out.println("=====输出beanDefinitionNames=====");
        for (String beanDefinitionName:beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("=====输出beanDefinitionNames=====");
    }
}
