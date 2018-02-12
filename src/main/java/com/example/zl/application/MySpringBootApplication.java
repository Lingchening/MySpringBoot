package com.example.zl.application;

import com.example.zl.domain.ConfigDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController/*等价于@Controller+@ResponseBody的结合，使用这个注解的类里面的方法都以json格式输出。*/
@SpringBootApplication/*开启自动配置*/
@EnableConfigurationProperties({ConfigDomain.class})
public class MySpringBootApplication {

	/*启动项目有三种方式：*/
	/*1.右键run()*/
	/*2.mvn spring-boot:run*/
	/*3.运行“mvn package”进行打包时，会打包成一个可以直接运行的 JAR 文件，使用“java 	-jar”命令就可以直接运行。*/

	/*项目启动的入口*/
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}
	/*@Value("${com.zl.name}")
	private String name;

	@Value("${com.zl.age}")
	private int age;
	@RequestMapping("/")
	public String index(){
		return "Hello "+name+" "+age;
	}*/

	@Autowired
	private ConfigDomain configDomain;

	@RequestMapping("/")
	public String index(){
		return "Hello "+configDomain.getName()+" "+configDomain.getAge();
	}

}
