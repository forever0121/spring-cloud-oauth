package com.iber;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by 刘晓杰 on 2017/12/8.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.iber.mapper")
public class IberMemberServiceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(IberMemberServiceApiApplication.class, args);
    }

}
