package com.landerer.spring.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class EnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hey, hi and hello!";
    }
}
