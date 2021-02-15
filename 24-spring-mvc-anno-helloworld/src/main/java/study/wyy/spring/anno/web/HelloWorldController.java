package study.wyy.spring.anno.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/13 10:09 下午
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
