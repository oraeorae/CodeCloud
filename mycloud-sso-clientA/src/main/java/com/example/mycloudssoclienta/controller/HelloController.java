package com.example.mycloudssoclienta.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class HelloController {

    @Value("${sso.server.url}")
    private String ssoServer;


    @GetMapping("/employee")
    public String employee(Model model, HttpSession httpSession,
                           @RequestParam(value = "token", required = false) String token){
        if (!StringUtils.isEmpty(token)){
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> entity = restTemplate.getForEntity("http://ssoserver.com:8080/userinfo?token=" + token, String.class);
            String body = entity.getBody();
            httpSession.setAttribute("loginUser", body);
        }
        Object loginUser = httpSession.getAttribute("loginUser");
        if (ObjectUtils.isEmpty(loginUser)){
            return "redirect:" + this.ssoServer + "?redirect_url=http://client1.com:8081/employee";
        } else {
            ArrayList<Object> objects = new ArrayList<>();
            objects.add("张三");
            objects.add("李四");

            model.addAttribute("emps", objects);
            return "list";
        }

    }
}
