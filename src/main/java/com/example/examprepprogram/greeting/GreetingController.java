package com.example.examprepprogram.greeting;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GreetingController {

    private GreetingRepository greetingRepository;

    @GetMapping("/hello")
    private ResponseEntity<Greeting> hello(){
        Greeting greeting = new Greeting("Hello There");
        greetingRepository.save(greeting);
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }



}
