package study.wyy.spring.proxy.demo.jdkproxy;

import study.wyy.spring.proxy.demo.RealSubject;
import study.wyy.spring.proxy.demo.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 13:33
 * @description: 代理对象生产工厂
 */
public class ProxyObjectFactory {

    private RealSubject realSubject = new RealSubject();
    public Subject getProxyObject(){
        /**
         *  ClassLoader loader: 类加载器
         *  Class<?>[] interfaces: 真实对象所实现的接口，
         *  代理模式真实对象和代理对象实现相同的接口---> 抽象主题
         *  InvocationHandler h: 代理对象的调用处理程序
         *  返回值：返回的就是代理对象
         */
        Object proxyInstance = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Subject.class}, new InvocationHandler() {
            /**
             * `Object proxy`:  代理对象
             * ` Method method`:  对应于在代理对象上调用的接口方法的 Method 实例
             * `Object[] args` ： 代理对象调用接口方法时传递的实际参数
             * 返回值：返回目标对象目标方法的返回值
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("=================打印形参====================");
                System.out.println("proxy类型：" + proxy.getClass().getName());
                System.out.println("method：" + method.getName());
                System.out.println("=================打印形参====================");
                // 执行目标对象目标方法：
                // 这里可以增加前置处理
                System.out.println("前置处理。。。。。。");
                // 执行目标方法,调用真实主题的方法
                Object invoke = method.invoke(realSubject);
                // 这里可以增加后置处理
                System.out.println("后置处理。。。。。。");
                // 返回目标方法的返回值
                return invoke;
            }
        });
        return (Subject) proxyInstance;
    }
}
