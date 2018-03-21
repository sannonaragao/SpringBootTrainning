package com.my.springboot.configprops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        MyAppConfig config = (MyAppConfig) ctx.getBean("myAppConfig");
        System.out.println(config.toString());
        
	}
}
