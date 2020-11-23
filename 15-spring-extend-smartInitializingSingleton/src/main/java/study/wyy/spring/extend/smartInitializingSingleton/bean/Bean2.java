package study.wyy.spring.extend.smartInitializingSingleton.bean;

/**
 * @author wyaoyao
 * @data 2020-11-23 07:49
 */
public class Bean2 {
    public String name;
    /**
     * 构造方法
     */
    public Bean2() {
        System.out.println("Bean2 constructor。。。");
    }

    /**
     * 初始化方法
     */
    public void init(){
        System.out.println("Bean2 init。。。");
        name = "world";
    }

    /**
     * 销毁方法
     */
    public void destroy(){
        System.out.println("Bean2 destroy。。。");

    }
}
