package com.example.zl.beantest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.zl")
public class TestConfiguration2 {
    public void TestConfiguration() {
        System.out.println("TestConfiguration容器启动初始化。。。");
    }
}
