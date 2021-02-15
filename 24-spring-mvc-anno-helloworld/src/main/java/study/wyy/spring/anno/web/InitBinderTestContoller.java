package study.wyy.spring.anno.web;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import study.wyy.spring.anno.model.User;


/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/14 9:12 下午
 */
@Controller
@RequestMapping("initBinder")
public class InitBinderTestContoller {

    @RequestMapping("/test01")
    public String test01(User user){
        System.out.println(user);
        return "success";
    }

    @InitBinder
    public void dateBinder(WebDataBinder dataBinder){
        dataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }
}
