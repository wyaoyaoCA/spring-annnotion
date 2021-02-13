package study.wyy.spring.anno.aop.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 15:33
 * @description:
 */
@Data
@ToString
public class User implements Serializable {
    private String id;
    private String username;
    private String password;
    private String email;
    private Date birthday;
    private String gender;
    private String mobile;
    private String nickname;

}
