package services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import repositories.GreetingRepository;

@Service
@Primary
@Profile({"en", "default"})
public class EnglishGreetingServiceImpl implements GreetingService {

    private final GreetingRepository repository;

    public EnglishGreetingServiceImpl(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayHello() {
        return this.repository.getEnglishGreeting();
    }
}
