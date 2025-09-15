package com.learning.ci_cd_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String greet() {
        return "Hello World! Great learning! Welcome to CI/CD Demo" ;
    }
}