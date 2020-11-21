package study.wyy.spring.anno.importer.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.wyy.spring.anno.common.model.Department;
import study.wyy.spring.anno.common.model.Person;
import study.wyy.spring.anno.importer.config.*;
import study.wyy.spring.anno.importer.node.MyNode;
import study.wyy.spring.anno.importer.service.ItemService;
import study.wyy.spring.anno.importer.service.StoreService;

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


    @Test
    public void test05(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig3.class);
        // 打印容易中的bean定义
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }
        System.out.println("=======================");
        ItemService itemService = context.getBean(ItemService.class);
        itemService.item();
        StoreService storeService = context.getBean(StoreService.class);
        storeService.store();
    }


    @Test
    public void test06(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig4.class);
        // 打印容易中的bean定义
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }
        System.out.println("=======================");
        MyNode myNode = context.getBean(MyNode.class);
        myNode.node();

    }

    @Test
    public void test07(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig5.class);
        // 打印容易中的bean定义
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }
        System.out.println("=======================");
        MyNode myNode = context.getBean(MyNode.class);
        myNode.node();

    }
}
