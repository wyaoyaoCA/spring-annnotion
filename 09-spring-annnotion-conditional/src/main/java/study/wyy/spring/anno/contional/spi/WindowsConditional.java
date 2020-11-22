package study.wyy.spring.anno.contional.spi;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;

import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/22 7:40 下午
 */
public class WindowsConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        // 1 获取环境信息
        Environment environment = context.getEnvironment();
        String os = environment.getProperty("os.name");
        if(os.contains("Windows")){
            return true;
        }
        return false;
    }
}
