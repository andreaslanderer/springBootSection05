package com.landerer.spring.didemo.controllers;

import com.landerer.spring.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService service;

    // Optional since Spring 4.2
    // @Autowired
    public ConstructorInjectedController(GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return this.service.sayHello();
    }
}
