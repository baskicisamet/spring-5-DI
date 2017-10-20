package com.sam.didemo.controller;

import com.sam.didemo.service.GreetingService;
import com.sam.didemo.service.GreetingServiceImpl;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }


}
