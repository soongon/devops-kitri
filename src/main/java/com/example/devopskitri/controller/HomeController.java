package com.example.devopskitri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "안녕 데브옵스...hi..sdfdsfsdfsdfsdfsdfs";
    }
}
