package study.wyy.spring.anno.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/15 10:32 上午
 */
@Controller
@RequestMapping("exceptionHandler")
public class ExceptionHandlerController {

    @RequestMapping("test01")
    public String test01(Integer age) {
        if (age == null || age <= 0){
            throw new IllegalArgumentException("年龄不合法");
        }
        return "success";
    }

    /****
     *  value属性：指定的是可以处理哪些异常
     *  形参中的Exception e， 捕获到的异常
     *  通过Model model 返回错误信息给页面
     */
//    @ExceptionHandler(value = {IllegalArgumentException.class})
//    public String errorHandler(Exception e, Model model){
//        model.addAttribute("error",e.getMessage());
//        // 返回错误页面
//        return "error";
//    }
}
