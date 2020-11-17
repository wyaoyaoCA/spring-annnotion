package study.wyy.spring.anno.componentscan.anno;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/17 10:08 下午
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Node {
}
