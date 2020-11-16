package study.wyy.spring.anno.importer.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.common.model.Department;
import study.wyy.spring.anno.common.model.Person;
import study.wyy.spring.anno.importer.config.SpringConfig1;
import study.wyy.spring.anno.importer.config.SpringConfig2;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/17 7:18 上午
 */
public class Test01 {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig1.class);
        Department department = context.getBean("department", Department.class);
        System.out.println(department);
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }



    @Test
    public void test02(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig1.class, SpringConfig2.class);
        Department department = context.getBean("department", Department.class);
        System.out.println(department);
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void test03(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("study.wyy.spring.anno.importer.config");
        Department department = context.getBean("department", Department.class);
        System.out.println(department);
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void test04(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig1.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
