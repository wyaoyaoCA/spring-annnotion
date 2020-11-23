package study.wyy.spring.anno.life.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author wyaoyao
 * @data 2020-11-23 08:10
 */
public class LifeBean3 {

    public LifeBean3() {
        System.out.println("LifeBean3 constructor。。。");
    }
    /**
     * 容器销毁的对象的前通知
     * @throws Exception
     */
    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("LifeBean3 destroy。。。");
    }

    /**
     * bean创建完成并属性赋值完成的时候执行
     * @throws Exception
     */
    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeBean3 afterPropertiesSet。。。");
    }
}
