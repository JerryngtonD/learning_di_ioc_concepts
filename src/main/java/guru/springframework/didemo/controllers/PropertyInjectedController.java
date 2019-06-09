package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}