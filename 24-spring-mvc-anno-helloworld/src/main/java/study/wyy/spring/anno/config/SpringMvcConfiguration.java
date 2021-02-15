package study.wyy.spring.anno.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.VersionResourceResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import study.wyy.spring.anno.intercerptor.HandlerInterceptor1;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/13 10:16 下午
 */
@Configuration
// 扫描web层的组件: <context:component-scan base-package="cn.wyy.springmvc.controller" />
@ComponentScan("study.wyy.spring.anno.web")
@EnableWebMvc
public class SpringMvcConfiguration implements WebMvcConfigurer {

    /**
     *  配置视图解析器：对应当年xml：
     *  <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
     *     <!-- 配置逻辑视图的前缀  value的值就是jsp页面的路径-->
     *     <property name="prefix" value="/WEB-INF/pages/" />
     *     <!-- 配置逻辑视图的后缀 -->
     *     <property name="suffix" value=".jsp" />
     * </bean>
     */
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    /****
     *  <mvc:resources location="/css/" mapping="/css/**"/>
     * 	<mvc:resources location="/js/" mapping="/js/**"/>
     * 	<mvc:resources location="/fonts/" mapping="/fonts/**"/>
     *
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**","/images/**","/css/**")
                .addResourceLocations("/js/","/images/","/css/")
                .resourceChain(true)
                .addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"));
    }

    @Autowired
    HandlerInterceptor1 handlerInterceptor1;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(handlerInterceptor1);
    }

    @Bean("multipartResolver")
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        // 设置文件上传大小
        commonsMultipartResolver.setMaxUploadSize(5000000);
        return commonsMultipartResolver;
    }
}
