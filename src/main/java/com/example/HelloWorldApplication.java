package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
@EnableAutoConfiguration
public class HelloWorldApplication {
 
    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String hello(){
        return "Hello,world!";
    }
 
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}