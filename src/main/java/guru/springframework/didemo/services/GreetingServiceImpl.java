package guru.springframework.didemo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("DefaultGreetingService")
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GURUS = "Hello Gurus!!!!";


    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}

