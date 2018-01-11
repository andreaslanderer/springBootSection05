package com.landerer.spring.didemo.controllers;

import com.landerer.spring.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    private final GreetingService service;

    public PrimaryController(GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return this.service.sayHello();
    }
}
