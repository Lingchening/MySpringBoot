package com.example.zl.DB;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("proDB")
public class ProDB implements DBConnector {
    @Override
    public void configure() {
        System.out.println("proDB");
    }
    /**
     * 用于测试切换不同配置
     * mvn -package
     * java -jar target\demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=proDB
     */
}
