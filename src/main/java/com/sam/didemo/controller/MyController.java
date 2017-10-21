package com.sam.didemo.controller;


import com.sam.didemo.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String  sayHello(){

        return greetingService.sayGreeting();

    }

}
