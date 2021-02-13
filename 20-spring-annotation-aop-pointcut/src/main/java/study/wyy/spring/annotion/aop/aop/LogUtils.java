package study.wyy.spring.annotion.aop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/6 11:22 上午
 */
@Component
@Aspect
public class LogUtils {

    @Pointcut("execution(* study.wyy.spring.annotion.aop.service.impl.*.*(..))")
    protected void pointCut(){};


    @Before("pointCut()")
    public void beforeLog() {
        System.out.println("beforeLog: 执行日志打印");
    }

    @After("pointCut()")
    public void afterLog() {
        System.out.println("afterLog: 执行日志打印");
    }
}
