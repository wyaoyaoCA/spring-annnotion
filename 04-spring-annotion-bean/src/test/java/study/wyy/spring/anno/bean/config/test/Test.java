package study.wyy.spring.anno.bean.config.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.bean.config.*;
import study.wyy.spring.anno.common.model.Department;
import study.wyy.spring.anno.common.model.Person;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/16 7:42 下午
 */
public class Test {
    @org.junit.Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // bean的名字默认就是方法名
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

    @org.junit.Test
    public void test02(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig2.class);
        // bean的名字默认就是方法名
        Person person = context.getBean("T-MAC", Person.class);
        System.out.println(person);
    }

    @org.junit.Test
    public void test03(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig3.class);
        // bean的名字默认就是方法名
        Department department = context.getBean("department", Department.class);
        System.out.println(department.getManager());
    }

    @org.junit.Test
    public void test04(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig4.class);
        // bean的名字默认就是方法名
        Department department = context.getBean("department", Department.class);
        System.out.println(department.getManager());
    }

    @org.junit.Test
    public void test05(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig5.class);
        // bean的名字默认就是方法名
        Department department = context.getBean("department", Department.class);
        System.out.println(department.getManager());
    }

    @org.junit.Test
    public void test06(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig6.class);
        // bean的名字默认就是方法名
        Department department = context.getBean("department", Department.class);

    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig6.class);
        // bean的名字默认就是方法名
        Department department = context.getBean("department", Department.class);
    }



}
