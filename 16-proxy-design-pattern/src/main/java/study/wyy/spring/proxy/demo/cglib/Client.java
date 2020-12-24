package study.wyy.spring.proxy.demo.cglib;

import study.wyy.spring.proxy.demo.RealSubject;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 14:38
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        ProxyObjectFactory proxyObjectFactory = new ProxyObjectFactory();
        RealSubject proxyObject = proxyObjectFactory.getProxyObject();
        proxyObject.process();
    }
}
