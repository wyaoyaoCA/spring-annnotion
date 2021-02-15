package study.wyy.spring.anno.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author by wyaoyao
 * @Description RequestMapping注解测试
 * @Date 2021/2/14 12:56 下午
 */
@RequestMapping("requestParam")
@Controller
public class RequestParamTestController {


    /**
        1. 请求提交的参数名username，会被赋值到形参的name中
        2. 形参age指定使用RequestParam注解，所以如果请求参数中带有age参数，就会被赋值到形参age中
        3. 并且username参数是必须要带的，如果没有username参数，默认位置wyy
     总而言之：RequestParam作用就是
        1. 当请求参数和控制器中形参不一致时，可以使用该注解进行映射： name属性
        2. 为请求参数设置默认值： defaultValue属性
        3. 设置请求参数是否必须有值: required属性
     */
    @RequestMapping(path = "/test01")
    public String test01(@RequestParam(name = "username",defaultValue = "wyy",required = true) String name, Integer age) {
        System.out.println("name: " + name + ";age: " + age);
        return "success";
    }


}
