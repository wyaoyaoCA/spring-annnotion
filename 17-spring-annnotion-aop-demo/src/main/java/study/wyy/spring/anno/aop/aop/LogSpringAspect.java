package study.wyy.spring.anno.aop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 16:01
 * @description:
 */
@Slf4j
@Aspect
@Component
public class LogSpringAspect {


    /***
     * 前置通知: 在方法执行之前进行日志打印
     *
     * */
    @Before("execution(* study.wyy.spring.anno.aop.service.impl.*.*save(..))")
    public void beforeLog() {
        log.info("execute method with params is {}");
    }

    /***
     * 后置通知: 在目标方法执行后实施增强，比如在方法执行结束后，打印日志
     * */
    @AfterReturning("execution(* study.wyy.spring.anno.aop.service.impl.*.save(..))")
    public void afterReturningLog() {
        log.info("execute success ...");
    }

    /***
     * 异常通知
     *  发生异常的时候执行
     * */
    @AfterThrowing("execution(* study.wyy.spring.anno.aop.service.impl.*.save(..))")
    public void afterThrowingLog() {
        log.info("execute method error {} with params {}");
    }

}
