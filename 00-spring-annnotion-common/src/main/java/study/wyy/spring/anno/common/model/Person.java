package study.wyy.spring.anno.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/12 9:23 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    private String name;

    private Integer age;
}
