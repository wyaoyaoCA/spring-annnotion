package study.wyy.spring.anno.propertysource.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.propertysource.bean.DataSource;
import study.wyy.spring.anno.propertysource.config.*;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/21 9:14 下午
 */
public class Test {

    @org.junit.Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);
    }

    @org.junit.Test
    public void test02(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig2.class);
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);
    }

    @org.junit.Test
    public void test03(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig3.class);
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
