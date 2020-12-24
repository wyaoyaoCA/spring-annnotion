package study.wyy.spring.proxy.demo.staticproxy;

import study.wyy.spring.proxy.demo.RealSubject;
import study.wyy.spring.proxy.demo.Subject;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 11:03
 * @description: 测试
 */
public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject proxySubject = new ProxySubject(realSubject);
        proxySubject.process();
    }
}
