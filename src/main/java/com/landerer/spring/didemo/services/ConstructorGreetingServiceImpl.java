package com.landerer.spring.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello, my constructor-injection-friend!";
    }
}
