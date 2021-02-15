package study.wyy.spring.anno.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/15 8:51 上午
 */
@Controller
public class HeaderAndCookieController {

    @RequestMapping("test")
    public String test(@RequestHeader("Accept-Language") String head, @CookieValue("JSESSIONID") String cookie){
        System.out.println(head);
        System.out.println(cookie);
        return "success";
    }
}
