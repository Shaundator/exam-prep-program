package com.example.examprepprogram.greeting;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private GreetingRepository greetingRepository;
    @GetMapping("/hello")
    private ResponseEntity<Greeting> hello(){
        Greeting greeting = new Greeting("Hello There");
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }



}
