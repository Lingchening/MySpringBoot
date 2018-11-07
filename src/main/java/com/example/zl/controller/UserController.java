package com.example.zl.controller;

import com.example.zl.domain.ConfigDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//
public class UserController {
    @Autowired
    private ConfigDomain configDomain;
//
//    @RequestMapping("/")
//    public String hello(){
//        return configDomain.getName()+configDomain.getAge();
//    }
//
//    @Value("${com.zl.name}")
//    private  String name;
//    @Value("${com.zl.age}")
//    private  int want;
//
//    @RequestMapping("/test")
//    public String hexo(){
//        return name+":"+want;
//    }
    @Value("${test1.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
