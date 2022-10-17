package com.example.mycloudcoupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient      //开启服务注册与发现功能
public class MycloudCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycloudCouponApplication.class, args);
    }

}
