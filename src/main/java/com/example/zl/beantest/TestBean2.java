package com.example.zl.beantest;

import org.springframework.stereotype.Component;

@Component
public class TestBean2 {

    private String username;
    private String url;
    private String password;

    public void sayHello() {
        System.out.println("TestBean sayHello...");
    }

    /*public String toString() {
        return "username:" + this.username + ",url:" + this.url + ",password:" + this.password;
    }*/

    public void start() {
        System.out.println("TestBean 初始化。。。");
    }

    public void cleanUp() {
        System.out.println("TestBean 销毁。。。");
    }
}
