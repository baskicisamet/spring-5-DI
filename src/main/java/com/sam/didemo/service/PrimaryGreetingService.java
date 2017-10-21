package com.sam.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Greeting from Primary greeting service";
    }

}
