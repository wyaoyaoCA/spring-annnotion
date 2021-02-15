package study.wyy.spring.anno.web.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/15 10:45 上午
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    /****
     *  value属性：指定的是可以处理哪些异常
     *  形参中的Exception e， 捕获到的异常
     *  通过Model model 返回错误信息给页面
     */
    @ExceptionHandler(value = {IllegalArgumentException.class})
    public String errorHandler(Exception e, Model model){
        model.addAttribute("error",e.getMessage());
        // 返回错误页面
        return "error";
    }
}
