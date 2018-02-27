package com.example.zl.beantest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        // @Configuration注解的spring容器加载方式，用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);

        /*
        *使用 AnnotationConfigApplicationContext 注册 AppContext 类的两种方法
        *或者
        * ApplicationContext ctx = new AnnotationConfigApplicationContext();
        * ctx.register(TestConfiguration.class)
        *
        *
        *
        *
        * */

        // 如果加载spring-context.xml文件：
        // ApplicationContext context = new
        // ClassPathXmlApplicationContext("spring-context.xml");

        //获取bean
        TestBean testBean = (TestBean) applicationContext.getBean("testBean");
        testBean.sayHello();
        System.out.println(testBean);

        TestBean t2 = (TestBean) applicationContext.getBean("testBean");
        t2.sayHello();
        System.out.println(t2);

        /*分析：

        结果中的1：表明initMethod生效

        结果中的2：表明@Scope("prototype")生效
        */

        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration2.class);

        // 如果加载spring-context.xml文件：
        // ApplicationContext context = new
        // ClassPathXmlApplicationContext("spring-context.xml");

        //获取bean
        TestBean2 tb = (TestBean2) context.getBean("testBean2");
        tb.sayHello();
    }
}
