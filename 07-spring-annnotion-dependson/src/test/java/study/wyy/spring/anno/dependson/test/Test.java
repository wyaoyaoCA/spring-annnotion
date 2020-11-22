package study.wyy.spring.anno.dependson.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.dependson.config.SpringConfig;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 11:33 上午
 */
public class Test {

    @org.junit.Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 启动容器
        context.start();
    }
}
