package com.landerer.spring.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hey, hi and hello!";
    }
}
