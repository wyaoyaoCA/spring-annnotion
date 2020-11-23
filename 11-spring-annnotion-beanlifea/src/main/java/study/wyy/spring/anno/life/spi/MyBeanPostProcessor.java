package study.wyy.spring.anno.life.spi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import study.wyy.spring.anno.life.bean.LifeBean4;

/**
 * @author wyaoyao
 * @data 2020-11-23 08:21
 * BeanPostProcessor：Bean初始化前后进行增强处理
 */

public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     *
     * @param bean : 当前的处理Bean
     * @param beanName 当前Bean的name
     * @return 可以返回当前的Bean也可以返回当前Bean的包装
     * @throws BeansException
     * 初始化之前
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeBean4){
            // 只对LifeBean4类型进行增强
            System.out.println("BeanPostProcessor "+ beanName +"postProcessBeforeInitialization 。。。");
        }
        return bean;
    }

    /**
     *
     * @param bean 当前的处理Bean
     * @param beanName 当前Bean的name
     * @return 可以返回当前的Bean也可以返回当前Bean的包装
     * @throws BeansException
     * 初始化之后
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeBean4){
            // 只对LifeBean4类型进行增强
            System.out.println("BeanPostProcessor "+ beanName +"postProcessAfterInitialization 。。。");
        }
        return bean;
    }
}
