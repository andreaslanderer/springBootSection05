package services;

import repositories.GreetingRepository;

public class GreetingServiceFactory {

    private final GreetingRepository repository;

    public GreetingServiceFactory(GreetingRepository repository) {
        this.repository = repository;
    }

    public GreetingService createGreetingService(String lang) {
        if (lang != null) {
            switch(lang) {
                case "en":
                    return new EnglishGreetingServiceImpl(this.repository);
                case "de":
                    return new GermanGreetingServiceImpl(this.repository);
                case "es":
                    return new SpanishGreetingServiceImpl(this.repository);
            }
        }
        throw new IllegalArgumentException();

    }
}
