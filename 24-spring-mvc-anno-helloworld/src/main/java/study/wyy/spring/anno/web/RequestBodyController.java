package study.wyy.spring.anno.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import study.wyy.spring.anno.model.User;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/15 9:50 上午
 */
@Controller
@RequestMapping("requestBody")
// 表示存入一个name值
@RestControllerAdvice
public class RequestBodyController {


    @RequestMapping("/test01")
    public String test01(@RequestBody User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/test01")
    public @ResponseBody User test02(@RequestBody User user){
        System.out.println(user);
        return user;
    }



}
