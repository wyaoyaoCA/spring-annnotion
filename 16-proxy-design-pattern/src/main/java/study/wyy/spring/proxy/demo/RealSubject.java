package study.wyy.spring.proxy.demo;


/**
 * @author: wyaoyao
 * @date: 2020-12-24 10:53
 * @description: 真实主题：实现业务逻辑
 */
public class RealSubject implements Subject {
    @Override
    public void process() {
        System.out.println("执行真实主题实现的逻辑");
    }
}
