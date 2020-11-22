package study.wyy.spring.anno.propertysource.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import study.wyy.spring.anno.propertysource.bean.DataSource;
import study.wyy.spring.anno.propertysource.spi.YamlPropertySourceFactory;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/11/21 9:05 下午
 */
@Configuration
@PropertySource(value = "classpath:jdbc.yml",factory = YamlPropertySourceFactory.class)
public class JdbcConfig3 {
    @Value("${mysql.driver}")
    private String driver;

    @Value("${mysql.url}")
    private String url;

    @Value("${mysql.username}")
    private String username;

    @Value("${mysql.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
        DataSource dataSource = new DataSource();
        dataSource.setDriver(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
