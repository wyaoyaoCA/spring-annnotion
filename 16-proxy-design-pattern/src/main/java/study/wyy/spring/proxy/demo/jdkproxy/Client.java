package study.wyy.spring.proxy.demo.jdkproxy;

import study.wyy.spring.proxy.demo.Subject;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 13:57
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        ProxyObjectFactory proxyObjectFactory = new ProxyObjectFactory();
        Subject proxyObject = proxyObjectFactory.getProxyObject();
        proxyObject.process();
        ProxyObjectFactory2 proxyObjectFactory2 = new ProxyObjectFactory2();
        Subject proxyObject2 = proxyObjectFactory2.getProxyObject();
        proxyObject2.process();

    }
}
