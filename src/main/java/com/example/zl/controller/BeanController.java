package com.example.zl.controller;

import com.example.zl.beantest.Test2Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class BeanController {
    @Autowired
    Test2Bean test2;

    @RequestMapping("/")
    public String test2(){
        return test2.getName()+","+test2.getAge();
    }
}
