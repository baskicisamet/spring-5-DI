package com.sam.didemo.controller;

import com.sam.didemo.service.GreetingService;
import com.sam.didemo.service.GreetingServiceImpl;

public class GetterInjectedController {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
