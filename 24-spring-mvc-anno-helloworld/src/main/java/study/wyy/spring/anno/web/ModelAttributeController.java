package study.wyy.spring.anno.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/15 9:12 上午
 */
@Controller
@RequestMapping("modelAttribute")
public class ModelAttributeController {

    /****
     * 修饰在方法上，会在当前控制器的方法执行前执行
     * 可以对控制器进行一些前置处理
     * @param name
     */
    // name属性或者value属性指定key
    @ModelAttribute("username")
    public String modelAttribute(String name, Model model){
        System.out.println("modelAttribute：" + name);
        // 比如把name 给拼接上123
        //model.addAttribute("username",name + "123");
        // 通过返回值存数据
        return name + "123";
    }

    @RequestMapping("test01")
    public String test01(String name, ModelMap model, @ModelAttribute("username") String username){
        System.out.println("controller: " + name);
        //System.out.println("username:" + model.get("username"));
        System.out.println("username:" + username);
        return "success";
    }
}
