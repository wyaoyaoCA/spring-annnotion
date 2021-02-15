package study.wyy.spring.anno.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/15 9:50 上午
 */
@Controller
@RequestMapping("sessionAttribute")
// 表示存入一个name值
@SessionAttributes(value = {"name"})
public class SessionAttributeController {

    /*****
     * 当我们在控制器方法形参中加入Model或者ModelMap类型参数时，默认是存入请求域的。
     * @return
     */
    @RequestMapping("/test01")
    public String test01(Model model){
        // 存入一个数据，key是name, value是wyy
        // 没有使用SessionAttributes的时候是存入到请求域中的，使用SessionAttributes注解，也会将数据存到会话域
        model.addAttribute("name","wyy");
        return "success";
    }

    /*****
     * 取数据
     * @return
     */
    @RequestMapping("/test02")
    public String test02(@SessionAttribute String name){
        System.out.println("name: "+ name);
        return "success";
    }
}
