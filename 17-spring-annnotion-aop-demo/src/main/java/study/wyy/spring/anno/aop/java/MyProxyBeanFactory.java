package study.wyy.spring.anno.aop.java;

import study.wyy.spring.anno.aop.aop.LogUtil;
import study.wyy.spring.anno.aop.service.UserService;
import study.wyy.spring.anno.aop.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wyaoyao
 * @description
 * @date 2021/2/1 16:59
 * 生成代理对象，使用java
 */
public class MyProxyBeanFactory {

    public static UserService createUserService() {
        // 1 目标而对象
        UserService userService = new UserServiceImpl();
        // 2 切面类
        LogAspect logAspect = new LogAspect();
        // 3 创建代理对象
        /*****
         * 参数一：类加载器
         * 参数二：目标对象和代理对象实现的接口的字节码对象的数组,接口的方法会被拦截,这里要拦截的就是UserService中的方法，
         *
         * 参数三：InvocationHandler h 处理器，在此内部实现方法的增强
         */
        Object o = Proxy.newProxyInstance(MyProxyBeanFactory.class.getClassLoader(), new Class[]{UserService.class}, new InvocationHandler() {
            /****
             *
             * @param proxy
             * @param method: 要拦截的方法，要执行增强的方法
             * @param args：拦截方法的参数
             * @return 拦截方法的返回值
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 执行方法之前进行日志打印
                logAspect.beforeLog();
                try {
                    // 执行方法
                    Object invoke = method.invoke(userService, args);
                    // 执行后再打印日志
                    logAspect.afterReturningLog();
                    return invoke;
                } catch (Exception e) {
                    // 发生异常，打印异常日志
                    logAspect.afterThrowingLog();
                    // 把人家的异常接着在跑出去
                    throw e;
                }

            }
        });

        return (UserService) o;
    }
}
