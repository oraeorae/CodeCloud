package com.example.mycloudmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient      //开启服务注册与发现功能
@EnableFeignClients(basePackages= "com.example.mycloudmember.feign")//扫描接口方法注解
public class MycloudMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycloudMemberApplication.class, args);
    }

}
