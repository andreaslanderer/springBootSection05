package com.landerer.spring.didemo;

import com.landerer.spring.didemo.controllers.DiDemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        final ApplicationContext context = SpringApplication.run(MainApplication.class, args);
        final DiDemoController controller = (DiDemoController) context.getBean("diDemoController");
        System.out.println(controller.sayHello());
    }
}
