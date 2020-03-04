package com.aalina.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Helllo - Primary Greeting Service";
    }
}
