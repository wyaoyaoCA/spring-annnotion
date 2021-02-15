package study.wyy.spring.anno.web.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/14 10:18 下午
 */
@ControllerAdvice
public class DataFormatAdvice {

    @Autowired
    private Converter stringToDateConverter;

    @InitBinder
    public void dateBinder(WebDataBinder dataBinder){
        dataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
        //1.获取转换服务对象
        ConversionService conversionService = dataBinder.getConversionService();
        //2.判断conversionService是否为GenericConversionService类型
        if(conversionService instanceof GenericConversionService){
            //3.强转
            GenericConversionService genericConversionService = (GenericConversionService)conversionService;
            //4.添加类型转换器
            genericConversionService.addConverter(stringToDateConverter);

        }

    }
}
