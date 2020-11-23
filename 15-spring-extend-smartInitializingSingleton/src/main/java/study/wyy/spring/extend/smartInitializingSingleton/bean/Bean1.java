package study.wyy.spring.extend.smartInitializingSingleton.bean;

/**
 * @author wyaoyao
 * @data 2020-11-23 07:49
 */
public class Bean1 {
    public String name;

    /**
     * 构造方法
     */
    public Bean1() {
        System.out.println("Bean1 constructor。。。");
    }

    /**
     * 初始化方法
     */
    public void init(){
        System.out.println("Bean1 init。。。");
        name = "hello";
    }

    /**
     * 销毁方法
     */
    public void destroy(){
        System.out.println("Bean1 destroy。。。");

    }
}
