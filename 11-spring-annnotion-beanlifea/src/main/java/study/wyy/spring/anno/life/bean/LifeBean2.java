package study.wyy.spring.anno.life.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author wyaoyao
 * @data 2020-11-23 07:49
 */
public class LifeBean2 implements InitializingBean, DisposableBean {

    /**
     * 构造方法
     */
    public LifeBean2() {
        System.out.println("LifeBean2 constructor。。。");
    }


    /**
     * 销毁方法
     */
    @Override
    public void destroy(){
        System.out.println("LifeBean2 destroy。。。");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeBean2 afterPropertiesSet。。。");
    }
}
