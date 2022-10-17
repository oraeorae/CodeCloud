package com.example.mycloudauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient      //开启服务注册与发现功能
public class MycloudAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycloudAuthApplication.class, args);
    }

}
