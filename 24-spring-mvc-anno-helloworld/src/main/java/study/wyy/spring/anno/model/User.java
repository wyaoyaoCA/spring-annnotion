package study.wyy.spring.anno.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/14 9:21 下午
 */
@Data
@ToString
public class User implements Serializable {
    private String username;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date  birthday;
}
