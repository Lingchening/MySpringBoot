package com.example.zl.DB;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("devDB")
public class DevDB implements DBConnector{
    @Override
    public void configure() {
        System.out.println("devDb");
    }
}
