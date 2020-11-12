package study.wyy.spring.anno.rumen;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.rumen.config.SpringConfig;
import study.wyy.spring.anno.common.model.Person;

import static org.hamcrest.CoreMatchers.equalTo;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/12 9:28 下午
 */
public class SpringConfigTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
        Assert.assertThat(bean.getName(), equalTo("Kobe"));
        Assert.assertThat(bean.getAge(), equalTo(20));
    }
}
