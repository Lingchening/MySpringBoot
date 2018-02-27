package com.example.zl.controller;

import com.example.zl.domain.ConfigDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//
public class UserController {
    @Autowired
    private ConfigDomain configDomain;

    @RequestMapping("/")
    public String hello(){
        return configDomain.getName()+configDomain.getAge();
    }
}
