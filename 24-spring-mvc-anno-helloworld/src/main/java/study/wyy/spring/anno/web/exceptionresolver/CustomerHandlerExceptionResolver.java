package study.wyy.spring.anno.web.exceptionresolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author by wyaoyao
 * @Description： 自定义异常处理解析器
 * @Date 2021/2/15 7:58 下午
 */
@Component
public class CustomerHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //1.创建返回值对象
        ModelAndView mv = new ModelAndView();
        //2.设置错误提示信息
        if(ex instanceof IllegalArgumentException){
            mv.addObject("errorMsg",ex.getMessage());
        }else {
            //系统异常
            mv.addObject("errorMsg","服务器内部错误，请联系管理员！");
        }
        //3.设置结果视图名称
        mv.setViewName("error");
        //4.返回
        return mv;
    }
}
