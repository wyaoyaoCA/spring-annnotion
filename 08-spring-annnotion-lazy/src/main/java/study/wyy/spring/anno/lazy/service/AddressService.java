package study.wyy.spring.anno.lazy.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 11:47 上午
 */
@Component
@Lazy(value = true)
public class AddressService {
    public AddressService() {
        System.out.println("AddressService 创建。。。。。");
    }

    public void saveAddress(){
        System.out.println("保存地址....");
    }
}
