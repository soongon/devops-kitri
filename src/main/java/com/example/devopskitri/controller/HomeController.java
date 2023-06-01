package com.example.devopskitri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "안녕 데브옵스...잘 동작되는지 테스트 합니다.";
    }

    @GetMapping("/")
    public String root() {
        return "안녕 반가워..소스 수정 했어.. 방금 1:33";
    }
}
