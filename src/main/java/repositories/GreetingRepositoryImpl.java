package repositories;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hey";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola";
    }
}
