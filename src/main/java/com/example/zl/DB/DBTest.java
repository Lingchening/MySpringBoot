package com.example.zl.DB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DBTest {
    @Autowired
    DBConnector dbConnector;

    @RequestMapping("/testdb")
    public String hellodb(){
        dbConnector.configure();
        return "db test";
    }


}
