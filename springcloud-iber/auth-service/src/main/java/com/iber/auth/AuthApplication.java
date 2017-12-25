package com.iber.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring Security Config模块一共有3个builder，认证相关的AuthenticationManagerBuilder和web相关的WebSecurity、HttpSecurity。
 * AuthenticationManagerBuilder用来配置全局的认证相关的信息，其实就是AuthenticationProvider和UserDetailsService，前者是认证服务提供商，后者是用户详情查询服务。
 */
@EnableTransactionManagement
@SpringBootApplication
@EnableCaching
@EnableDiscoveryClient
@MapperScan("com.iber.auth.repository")
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
}
