package study.wyy.spring.proxy.demo.staticproxy;

import study.wyy.spring.proxy.demo.RealSubject;
import study.wyy.spring.proxy.demo.Subject;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 10:58
 * @description:
 * 代理对象，需要持有真实主题，代理真实主题去执行他的职责，
 * 还要实现抽象主题（让使用者感知不到使用的代理对象）
 */
public class ProxySubject implements Subject {
    // 需要持有真实主题
    private RealSubject subject;
    public ProxySubject(RealSubject subject){
        this.subject = subject;
    }

    @Override
    public void process() {
        // 前置处理
        System.out.println("增强真实主题逻辑：前置处理");
        // 执行真实主题的职责
        subject.process();
        // 后置处理
        System.out.println("增强真实主题逻辑：后置处理");
    }
}
