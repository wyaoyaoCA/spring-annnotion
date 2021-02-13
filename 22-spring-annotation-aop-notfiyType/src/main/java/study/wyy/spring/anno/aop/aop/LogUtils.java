package study.wyy.spring.anno.aop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import study.wyy.spring.anno.aop.model.User;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 16:01
 * @description:
 */
@Slf4j
@Aspect
@Component
public class LogUtils {


    //@Before(value = "execution(* study.wyy.spring.anno.aop.service.impl.*.*save(..))")
    //@Before(value = "execution(* study.wyy.spring.anno.aop.service.impl.*.*save())")
    //@Before(value = "execution(* study.wyy.spring.anno.aop.service.impl.*.*(study.wyy.spring.anno.aop.model.User,java.lang.String))")
    //@Before(value = "execution(* study.wyy.spring.anno.aop.service.impl.*.*(study.wyy.spring.anno.aop.model.User,java.lang.Integer))")
    //@Before(value = "@annotation(java.lang.Deprecated)")
    //@Before(value = "@annotation(java.lang.Deprecated)")
    //@Before(value = "args(study.wyy.spring.anno.aop.model.User,java.lang.String)")
    //@Before(value = "bean(userServiceImpl)")
    //@Before(value = "target(study.wyy.spring.anno.aop.service.UserService)")
    // @Before(value = "@target(org.springframework.stereotype.Controller)")
    //@Before(value = "within(study.wyy.spring.anno.aop.service.UserService)")
    // @Before(value = "within(study.wyy.spring.anno.aop.service.impl.UserServiceImpl)")
//    public void beforeLog() {
//        System.out.println("[前置通知：beforeLog]: 在方法执行之前进行日志打印");
//    }

    @Pointcut(value = "execution(* study.wyy.spring.anno.aop.service.impl.*.*save(..))&&args(user,id)",argNames = "user,id")
    private void pointCut(User user, String id){

    }


    @Before("pointCut(user,id)")
    public void beforeLog(User user, String id) {
        System.out.println("user参数：" + user);
        System.out.println("  id参数：" + id);
        System.out.println("[前置通知：beforeLog]: 在方法执行之前进行日志打印");
    }

    @AfterReturning(value = "pointCut(user,id)",returning="res")
    public void AfterLog(User user, String id,User res) {
        System.out.println("返回值为：" + res);
        System.out.println("[后置通知：AfterLog]: 在目标方法执行后实施增强 在方法执行结束后，打印日志");
    }

    @AfterThrowing(value = "pointCut(user,id)",throwing="t")
    public void afterThrowingLog(User user, String id,Throwable t) {
        System.out.println("异常信息：" + t.getMessage());
        System.out.println("[后置通知：AfterLog]: 在目标方法执行后实施增强 在方法执行结束后，打印日志");
    }

}
