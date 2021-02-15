package study.wyy.spring.anno.intercerptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/15 7:33 下午
 *  * 第一步：编写一个普通类，实现HandlerInterceptor接口
 *  * 第二步：把拦截器用注解存入IOC容器
 *  * 第三步：注册到InterceptorRegistry中
 */
@Component
public class HandlerInterceptor1 implements HandlerInterceptor {


    /****
     * 拦截器的拦截方法，它是在控制器方法执行之前先执行。可以做一些前置增强
     */
    @Override
    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
        System.out.println("HandlerInterceptor1....preHandle");
        return true;
    }

    /**
     * 它是拦截器的后处理方法，执行时机在控制器方法执行之后，同时结果视图执行之前。它可以对响应数据进行增强
     */
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        System.out.println("HandlerInterceptor1....postHandle");
    }


    /****
     * 它是拦截器最后执行的方法，执行时机在结果视图执行完成之后，响应之前
     */
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        System.out.println("HandlerInterceptor1....afterCompletion");
    }

}
