package com.example.zl.beantest;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zl
 * @date 2018.11.02
 * @description 用于测试配置文件注入参数
 */

@ConfigurationProperties(prefix = "test2")
public class Test2Bean {
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
