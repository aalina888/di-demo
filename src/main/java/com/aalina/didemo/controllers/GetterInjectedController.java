package com.aalina.didemo.controllers;

import com.aalina.didemo.services.GreetingService;
import com.aalina.didemo.services.GreetingServiceImpl;

public class GetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
