package com.my.springboot.errors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

/*
 * com.my.toysforshots.controller.CustomErrorController
 * com.my.toysforshots.controller.ExceptionControllerAdvice
 * \src\main\resources\templates\customError.html
 * 
 */

@SpringBootApplication (scanBasePackages = "com.my")
public class ErrorsApplication {

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){
		return ( container -> {
			ErrorPage custom404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404");
			container.addErrorPages(custom404Page);
		});
	}
	
    public static void main(String[] args) {
        SpringApplication.run(ErrorsApplication.class, args);
    }
}