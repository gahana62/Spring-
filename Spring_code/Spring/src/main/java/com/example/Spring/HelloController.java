package com.example.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/spring")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Project!";
    }
}
