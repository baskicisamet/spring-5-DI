package com.sam.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements  GreetingService {
    @Override
    public String sayGreeting() {
        return "greeting from getter";
    }
}
