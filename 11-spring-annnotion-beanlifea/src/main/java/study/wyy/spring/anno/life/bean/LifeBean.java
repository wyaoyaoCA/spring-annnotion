package study.wyy.spring.anno.life.bean;

/**
 * @author wyaoyao
 * @data 2020-11-23 07:49
 */
public class LifeBean {

    /**
     * 构造方法
     */
    public LifeBean() {
        System.out.println("LifeBean constructor。。。");
    }

    /**
     * 初始化方法
     */
    public void init(){
        System.out.println("LifeBean init。。。");
    }

    /**
     * 销毁方法
     */
    public void destroy(){
        System.out.println("LifeBean destroy。。。");

    }
}
