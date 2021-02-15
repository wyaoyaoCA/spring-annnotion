package study.wyy.spring.anno.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
import study.wyy.spring.anno.web.filter.CrossOriginFilter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.EnumSet;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/13 11:12 下午
 */
public class Config extends AbstractDispatcherServletInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // 调用父类的onStartup
        super.onStartup(servletContext);

        // 创建乱码过滤器对象
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        // 设置字符集
        encodingFilter.setEncoding("UTF-8");
        // 添加到servlet容器中
        FilterRegistration.Dynamic registration = servletContext.addFilter("encodingFilter", encodingFilter);
        // 添加映射
        /**
         * 参数一：EnumSet<DispatcherType> dispatcherTypes： 过滤器可以处理的类型（ FORWARD 转发,INCLUDE 包含，REQUEST 请求，ASYNC，ERROR 错误）
         *
         * 参数二：boolean isMatchAfter
         *          true: 表示当前过滤器会在声明的过滤器（web.xml配置的过滤球）之后执行
         *          false：表示当前过滤器会在声明的过滤器（web.xml配置的过滤球）之前执行，这里没有使用web.xml,也就无所谓true，false了
         *                  但是如果有web.xml，肯定希望乱码过滤器要在之前执行（false）
         * 参数三：String... urlPatterns: url拦截规则
         *
         */
        registration.addMappingForUrlPatterns(
                EnumSet.of(DispatcherType.FORWARD,DispatcherType.REQUEST,DispatcherType.INCLUDE),
                false,
                "/*"
                );
        /**
         对应的就是之前web.xml的这段配置
         <filter>
            <filter-name>encoding</filter-name>
            <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
         <init-param>
            <param-name>encoding</param-name>
            <param-value>UTF-8</param-value>
         </init-param>
         </filter>
         <filter-mapping>
            <filter-name>encoding</filter-name>
             <url-pattern>/*</url-pattern>
         </filter-mapping>
         */
        // 注册解决跨域的过滤器
        FilterRegistration.Dynamic crossOriginFilter = servletContext.addFilter("crossOriginFilter", new CrossOriginFilter());
        crossOriginFilter.addMappingForUrlPatterns(
                EnumSet.of(DispatcherType.FORWARD,DispatcherType.REQUEST,DispatcherType.INCLUDE),
                false,
                "/*"
        );

    }

    /**
        创建Servlet容器，创建springmvc容器
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        // 由于是基于注解开发，创建注解开发对应的容器
        AnnotationConfigWebApplicationContext acw = new AnnotationConfigWebApplicationContext();
        // 注册配置类
        acw.register(SpringMvcConfiguration.class);
        return acw;
    }

    /**
      限定前端控制器的请求映射
        对应web.xml中，配置全段控制器的访问规则
         <servlet-mapping>
             <servlet-name>xxxxx</servlet-name>
            <url-pattern>/</url-pattern>
         </servlet-mapping>
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     创建根容器，根容器是不可以访问子容器Servlet容器的bean，也就控制了service层是不能访问controller层的bean
     创建springioc容器
     */
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        // 由于是基于注解开发，创建注解开发对应的容器
        AnnotationConfigWebApplicationContext acw = new AnnotationConfigWebApplicationContext();
        // 注册配置类: 这就要注册spring的配置类
        acw.register(ApplicationContextConfiguration.class);
        return acw;

    }
}
