package study.wyy.spring.anno.configuration.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/12 10:19 下午
 */
public class SpringConfigTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("study.wyy.spring.anno.configuration.config");
        SpringConfigUseComponent bean = context.getBean(SpringConfigUseComponent.class);
        //SpringConfigUseConfiguration bean2 = context.getBean(SpringConfigUseConfiguration.class);
        System.out.println(bean);
        //System.out.println(bean2);
    }
}
