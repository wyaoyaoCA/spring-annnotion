package study.wyy.spring.anno.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/16 8:22 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    // 管理者
    private Person manager;

    public void init(){
        System.out.println(manager);
    }

    public void destroy(){
        setManager(null);
        System.out.println("destroy.....");
    }
}
