package study.wyy.spring.proxy.demo.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import study.wyy.spring.proxy.demo.RealSubject;

import java.lang.reflect.Method;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 14:30
 * @description:
 */
public class ProxyObjectFactory {

    private RealSubject realSubject = new RealSubject();
    public RealSubject getProxyObject(){
        //1 创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer =new Enhancer();
        //2 设置父类的字节码对象
        enhancer.setSuperclass(RealSubject.class);
        //3 设置回调函数
        enhancer.setCallback(new MethodInterceptor(){
            /*
        intercept方法参数说明：
            o ： 代理对象
            method ： 真实对象中的方法的Method实例
            args ： 实际参数
            methodProxy ：代理对象中的方法的method实例
            */
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("=================打印形参====================");
                System.out.println("proxy类型：" + proxy.getClass().getName());
                System.out.println("method：" + method.getName());
                System.out.println("=================打印形参====================");
                // 执行目标对象目标方法：火车站的售票方法
                // 这里可以增加前置处理
                System.out.println("前置处理。。。。。。");
                Object result = methodProxy.invoke(realSubject, args);
                // 这里可以增加后置处理
                System.out.println("后置处理。。。。。。");
                return result;
            }
        });
        //4 创建代理对象
        RealSubject obj = (RealSubject) enhancer.create();

        return obj;
    }
}
