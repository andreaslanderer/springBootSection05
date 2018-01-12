package com.landerer.spring.didemo;

import controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import services.JokeService;

// If no @ComponentScan is provided Spring will scan this package and all subpackages
@SpringBootApplication
@ComponentScan(basePackages = {"services", "controllers", "repositories", "com.landerer.spring.didemo.config"})
public class MainApplication {
    public static void main(String[] args) {
        final ApplicationContext context = SpringApplication.run(MainApplication.class, args);

        final DiDemoController controller = (DiDemoController) context.getBean("diDemoController");
        System.out.println(controller.sayHello());

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(context.getBean(PrimaryController.class).sayHello());

        for (int i = 0; i < 5; i++) {
            System.out.println(context.getBean(JokeService.class).getJoke());
        }
    }
}