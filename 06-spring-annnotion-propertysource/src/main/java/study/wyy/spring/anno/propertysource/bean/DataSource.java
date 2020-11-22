package study.wyy.spring.anno.propertysource.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/21 9:06 下午
 */
@Data
@ToString
public class DataSource {

    private String driver;

    private String url;

    private String username;

    private String password;
}
