package com.example.examprepprogram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String index(){
        return "Hello There Index";
    }
}
