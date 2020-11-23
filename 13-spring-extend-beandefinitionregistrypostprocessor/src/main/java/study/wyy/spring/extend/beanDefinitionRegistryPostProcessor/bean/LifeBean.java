package study.wyy.spring.extend.beanDefinitionRegistryPostProcessor.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author wyaoyao
 * @data 2020-11-23 08:14
 */
public class LifeBean implements InitializingBean, DisposableBean {

    public LifeBean() {
        System.out.println("LifeBean constructor。。。");
    }


    /**
     * 销毁的时候执行
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("LifeBean4 destroy。。。");
    }

    /**
     * bean的属性设置完成之后执行
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeBean4 afterPropertiesSet。。。");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("LifeBean4 postConstruct。。。");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("LifeBean4 preDestroy。。。");
    }

    public void init(){
        System.out.println("LifeBean4 init。。。");
    }

    public void destroyOnBean(){
        System.out.println("LifeBean4 destroyOnBean。。。");
    }

}
