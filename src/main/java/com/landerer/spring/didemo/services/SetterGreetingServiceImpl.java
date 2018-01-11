package com.landerer.spring.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello, my setter-injection-friend!";
    }
}
