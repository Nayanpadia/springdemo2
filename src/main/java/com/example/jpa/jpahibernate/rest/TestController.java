package com.example.jpa.jpahibernate.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{

    @GetMapping("/test")
    public String nayan() {
        return "Hello";
    }
}
