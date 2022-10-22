package com.example.mycloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 这里是网关，资源服务器在这里统一鉴权
 */

@SpringBootApplication
@EnableDiscoveryClient      //开启服务注册发现
public class MycloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycloudGatewayApplication.class, args);
    }

}
