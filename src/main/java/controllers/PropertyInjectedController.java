package controllers;

import services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // BAD practice
    @Autowired
    // @Qualifier("englishGreetingServiceImpl")
    public GreetingService service;

    public String sayHello() {
        return this.service.sayHello();
    }

}
