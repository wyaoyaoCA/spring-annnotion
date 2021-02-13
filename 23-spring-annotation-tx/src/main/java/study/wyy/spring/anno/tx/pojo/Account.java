package study.wyy.spring.anno.tx.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/13 7:38 下午
 */
@Data
public class Account implements Serializable {

    private Integer id;
    private String name;
    private Integer money;
}
