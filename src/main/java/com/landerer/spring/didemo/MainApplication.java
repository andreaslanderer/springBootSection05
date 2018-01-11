package com.landerer.spring.didemo;

import com.landerer.spring.didemo.controllers.ConstructorInjectedController;
import com.landerer.spring.didemo.controllers.DiDemoController;
import com.landerer.spring.didemo.controllers.PropertyInjectedController;
import com.landerer.spring.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        final ApplicationContext context = SpringApplication.run(MainApplication.class, args);

        final DiDemoController controller = (DiDemoController) context.getBean("diDemoController");
        System.out.println(controller.sayHello());

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
    }
}
