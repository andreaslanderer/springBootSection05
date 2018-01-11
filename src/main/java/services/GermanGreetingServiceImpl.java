package services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class GermanGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Guten Tag!";
    }
}
