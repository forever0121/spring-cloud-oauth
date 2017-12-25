package com.iber.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * Created by 刘晓杰 on 2017/12/11.
 */
@Configuration
@PropertySource(value = "classpath:jdbc.properties")
public class DateSourceConfig {

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.driverClassName}")
    private String jdbcDriverClassName;

    @Value("${jdbc.username}")
    private String jdbcUsername;

    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        // 数据库驱动
        basicDataSource.setDriverClassName(jdbcDriverClassName);
        // 相应驱动的jdbcUrl
        basicDataSource.setUrl(jdbcUrl);
        // 数据库的用户名
        basicDataSource.setUsername(jdbcUsername);
        // 数据库的密码
        basicDataSource.setPassword(jdbcPassword);
        // 检查数据库连接池中空闲连接的间隔时间，单位是分，默认值：240，如果要取消则设置为0
        basicDataSource.setMaxActive(60);
        // 连接池中未使用的链接最大存活时间，单位是分，默认值：60，如果要永远存活设置为0
        basicDataSource.setMaxIdle(30);
        return basicDataSource;
    }
}
