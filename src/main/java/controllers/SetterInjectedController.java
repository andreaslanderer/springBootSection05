package controllers;

import services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService service;

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setService(GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return this.service.sayHello();
    }
}
