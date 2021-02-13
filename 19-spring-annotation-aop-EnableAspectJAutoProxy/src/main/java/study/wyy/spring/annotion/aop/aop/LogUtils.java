package study.wyy.spring.annotion.aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/6 11:22 上午
 */
@Component
@Aspect
public class LogUtils {

    /***
     * 前置通知: 在方法执行之前进行日志打印
     *
     * */
    //@Before("execution(* study.wyy.spring.annotion.aop.service.impl.*.*(..))")
    @Before("execution(* study.wyy.spring.annotion.aop.service.impl.*.*save(..))")
    public void beforeLog() {
        System.out.println("执行日志打印");
    }
}
