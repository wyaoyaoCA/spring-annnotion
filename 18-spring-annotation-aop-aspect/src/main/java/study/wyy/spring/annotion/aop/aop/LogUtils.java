package study.wyy.spring.annotion.aop.aop;

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
@Aspect("perthis(execution(* study.wyy.spring.annotion.aop.service.impl.*.*(..)))")
@Scope("prototype")
public class LogUtils {

    /***
     * 前置通知: 在方法执行之前进行日志打印
     *
     * */
    @Pointcut
    @Before("execution(* study.wyy.spring.annotion.aop.service.impl.*.*(..))")
    public void beforeLog() {
        System.out.println("执行日志打印");
    }
}
