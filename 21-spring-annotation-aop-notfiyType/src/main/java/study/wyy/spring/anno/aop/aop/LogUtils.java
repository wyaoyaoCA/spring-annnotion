package study.wyy.spring.anno.aop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
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
public class LogUtils {
    @Pointcut("execution(* study.wyy.spring.anno.aop.service.impl.*.*save(..))")
    private void pointCut(){};
    /***
     * 前置通知: 在方法执行之前进行日志打印
     *
     * */
    @Before("pointCut()")
    public void beforeLog() {
        System.out.println("[前置通知：beforeLog]: 在方法执行之前进行日志打印");
    }

    /***
     * 前置通知: 在方法执行之前进行日志打印
     *
     * */
    @Before("pointCut()")
    public void ceforeLog() {
        System.out.println("[前置通知：ceforeLog]: 在方法执行之前进行日志打印");
    }

    /***
     * 前置通知: 在方法执行之前进行日志打印
     *
     * */
    @Before("pointCut()")
    public void baforeLog() {
        System.out.println("[前置通知：baforeLog]: 在方法执行之前进行日志打印");
    }
    /***
     * 后置通知: 在目标方法执行后实施增强 在方法执行结束后，打印日志
     * */
    @AfterReturning("pointCut()")
    public void afterReturningLog() {
        System.out.println("[后置通知]: 在目标方法执行后实施增强 在方法执行结束后，打印日志");
    }

    /***
     * 异常通知
     *  发生异常的时候执行
     * */
    @AfterThrowing("pointCut()")
    public void afterThrowingLog() {
        System.out.println("[异常通知]: 发生异常的时候执行");
    }

    /***
     * 最终通知: 无论切入点方法执行是否产生异常最终通知都会执行
     * */
    @After("pointCut()")
    public void afterLog() {
        System.out.println("[最终通知]: 无论切入点方法执行是否产生异常最终通知都会执行");
    }

    /***
     * 环绕通知
     * */
    @Around("pointCut()")
    public void aroundPrintLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        try {
            try {
                System.out.println("[环绕通知]:前置通知");
                // 执行目标方法
                proceedingJoinPoint.proceed();
            }finally {
                System.out.println("[环绕通知]:最终通知");
            }
            System.out.println("[环绕通知]:后置通知");
        }catch (Exception e){
            System.out.println("[环绕通知]:异常通知");
        }
    }



}
