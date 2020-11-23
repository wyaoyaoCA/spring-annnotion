package study.wyy.spring.extend.smartInitializingSingleton.spi;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import study.wyy.spring.extend.smartInitializingSingleton.bean.Bean1;
import study.wyy.spring.extend.smartInitializingSingleton.bean.Bean2;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/23 10:37 下午
 */
@Component
public class MySmartInitializingSingleton implements SmartInitializingSingleton {
    @Autowired
    ApplicationContext context;
    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("MySmartInitializingSingleton => afterSingletonsInstantiated");
        Bean1 bean1 = context.getBean(Bean1.class);
        System.out.println("bean1.name => " + bean1.name);
        Bean2 bean2 = context.getBean(Bean2.class);
        System.out.println("bean2.name =>" + bean2.name);
    }
}
