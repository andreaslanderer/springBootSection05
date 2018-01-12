package services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import repositories.GreetingRepository;

@Service
@Primary
@Profile("de")
public class GermanGreetingServiceImpl implements GreetingService {

    private final GreetingRepository repository;

    public GermanGreetingServiceImpl(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayHello() {
        return this.repository.getGermanGreeting();
    }
}
