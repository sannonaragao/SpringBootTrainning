package com.my.springboot.Internationalization;


/*
 *  Check footer section at src/main/resources/templates/views/list.html
 * 
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.my.toysforshots.controller.PostController;

@SpringBootApplication(scanBasePackages = "com.my")
public class InternationalizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(InternationalizationApplication.class, args);
    }
}
