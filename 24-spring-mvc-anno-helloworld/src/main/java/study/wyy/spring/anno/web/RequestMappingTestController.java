package study.wyy.spring.anno.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author by wyaoyao
 * @Description  RequestMapping注解测试
 * @Date 2021/2/14 12:56 下午
 */
// RequestMapping可以放在类上
@RequestMapping("requestMapping")
@Controller
public class RequestMappingTestController {

    /****
     * 对应的请求路径：requestMapping/test01
     * 并且请求方式是get请求
     * 比如带有name参数：requestMapping/test01?name
     *
     */
    @RequestMapping(path = "/test01",method = RequestMethod.GET,params = {"name"})
    public String test01(){
        return "success";
    }
}
