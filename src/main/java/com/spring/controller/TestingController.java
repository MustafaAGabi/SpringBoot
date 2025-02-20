package com.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// https://http://localhost:8080
@RestController
@RequestMapping("/api")
// https://http://localhost:8080/api
public class TestingController
{
    @Value(value = "${admin.name}") // تستخدم لتحميل قيمة من ملف application.properties
    private String name;

    @GetMapping("name")
// https://http://localhost:8080/api/name
    public String getName(){
        return "I am " + name;
    }
    @GetMapping("/add")
    // Endpoint جديد لجمع عددين: http://localhost:8080/api/add
    public String addNumbers(@RequestParam String num1, @RequestParam String num2) {
        return num1 + num2; // إرجاع ناتج جمع العددين
    }

}
