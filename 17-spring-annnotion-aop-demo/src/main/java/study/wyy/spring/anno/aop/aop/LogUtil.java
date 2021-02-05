package study.wyy.spring.anno.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 16:01
 * @description:
 */
//@Aspect
//@Component
public class LogUtil {

    /*** 通用切入点表达式 */
    @Pointcut("execution(* study.wyy.spring.anno.aop.service.impl.*.*(..))")
    private void pt1(){

    }

    /*** 前置通知 */
    @Before("pt1()")
    public void beforeLog(){
        System.out.println("执行切入点方法前记录日志");
    }

    /***
     * 后置通知
     * */
    @AfterReturning("pt1()")
    public void afterReturningLog(){
        System.out.println("正常执行切入点方法后记录日志");
    }

    /***
     * 异常通知
     *  发生日志的时候执行
     * */
    @AfterThrowing("pt1()")
    public void afterThrowingLog() {
        System.out.println("执行切入点方法产生异常后记录日志");
    }

    /*** 最终通知 */
    @After("pt1()")
    public void afterLog(){
        System.out.println("无论切入点方法执行是否有异常都记录日志");
    }

    /*** 环绕通知 */
    @Around("pt1()")
    public Object arountPrintLog(ProceedingJoinPoint pjp){
        //1.定义返回值
        Object rtValue = null;
        try{
            //前置通知
            System.out.println("执行切入点方法前记录日志");
            //2.获取方法执行所需的参数
            Object[] args = pjp.getArgs();
            //3.执行切入点方法
            rtValue = pjp.proceed(args);
            // 后置通知
            System.out.println("正常执行切入点方法后记录日志");
        }catch (Throwable t){
            //异常通知
            System.out.println("执行切入点方法产生异常后记录日志");
        }finally {
            //最终通知
            System.out.println("无论切入点方法执行是否有异常都记录日志");
        }
        return rtValue;
    }
}
