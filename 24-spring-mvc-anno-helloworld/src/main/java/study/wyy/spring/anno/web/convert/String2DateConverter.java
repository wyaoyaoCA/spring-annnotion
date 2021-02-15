package study.wyy.spring.anno.web.convert;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/15 7:49 下午
 */
@Component
public class String2DateConverter implements Converter<String, Date> {


    @Override
    public Date convert(String source) {
        //1.判断来源是否有值
        if (StringUtils.isEmpty(source)) {
            throw new NullPointerException("Source can not be null!");
        }
        try{
            //2.定义转换器
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            //3.转换并返回
            return format.parse(source);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
