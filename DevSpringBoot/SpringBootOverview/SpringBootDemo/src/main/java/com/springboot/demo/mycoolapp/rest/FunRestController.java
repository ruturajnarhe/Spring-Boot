package com.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return " "

    @GetMapping("/")
    public String sayHello() {
        return "Hi I am Ruturaj, Welcome to the spring boot development";
    }
}
