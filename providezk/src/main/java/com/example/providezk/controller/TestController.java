package com.example.providezk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/cs")
    public String hello() {
        return "SpringCloud with zookeeper: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
