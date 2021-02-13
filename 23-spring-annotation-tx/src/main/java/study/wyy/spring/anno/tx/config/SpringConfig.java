package study.wyy.spring.anno.tx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/13 7:58 下午
 */
@Configuration
@ComponentScan("study.wyy.spring.anno.tx")
@EnableTransactionManagement  // 开启事务管理
public class SpringConfig {

    /**
        注入DataSource
     */
    @Bean
    DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/security");
        dataSource.setPassword("rootroot");
        dataSource.setUsername("root");
        return dataSource;
    }

    /**
     注入JdbcTemplate
     */
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    /**
     *  配置事务管理器
     */
    @Bean
    PlatformTransactionManager platformTransactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
