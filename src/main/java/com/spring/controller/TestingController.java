package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// https://http://localhost:8080
@RestController
@RequestMapping("/api")
// https://http://localhost:8080/api
public class TestingController
{
    @GetMapping("name")
// https://http://localhost:8080/api/name
    public String getName(){
        return "I am Mustafa Kabi";
    }
}
