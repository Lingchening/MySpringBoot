package com.example.zl;

import com.example.zl.beantest.Test2Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;
import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;

@RestController/*等价于@Controller+@ResponseBody的结合，使用这个注解的类里面的方法都以json格式输出。*/
@SpringBootApplication/*开启自动配置*/
//@EnableConfigurationProperties({ConfigDomain.class})
@EnableConfigurationProperties({Test2Bean.class})
public class Application {

	/*启动项目有三种方式：*/
	/*1.右键run()*/
	/*2.mvn spring-boot:run*/
	/*3.运行“mvn package”进行打包时，会打包成一个可以直接运行的 JAR 文件，使用“java 	-jar”命令就可以直接运行。*/

	/*项目启动的入口*/
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Autowired
	private Environment env;

	//destroy-method="close"的作用是当数据库连接不使用的时候,就把该连接重新放到数据池中,方便下次使用调用.
	@Bean
	public DataSource dataSource() {
		System.out.println("############初始化数据库#############");
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));//用户名
		dataSource.setPassword(env.getProperty("spring.datasource.password"));//密码
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		dataSource.setInitialSize(2);//初始化时建立物理连接的个数
		dataSource.setMaxActive(20);//最大连接池数量
		dataSource.setMinIdle(0);//最小连接池数量
		dataSource.setMaxWait(60000);//获取连接时最大等待时间，单位毫秒。
		dataSource.setValidationQuery("SELECT 1");//用来检测连接是否有效的sql
		dataSource.setTestOnBorrow(false);//申请连接时执行validationQuery检测连接是否有效
		dataSource.setTestWhileIdle(true);//建议配置为true，不影响性能，并且保证安全性。
		dataSource.setPoolPreparedStatements(false);//是否缓存preparedStatement，也就是PSCache
		return dataSource;
	}
}
