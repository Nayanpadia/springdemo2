package com.example.jpa.jpahibernate.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController{

    @GetMapping("/test")
    public String nayan() {
        return "Hello";
    }
}
