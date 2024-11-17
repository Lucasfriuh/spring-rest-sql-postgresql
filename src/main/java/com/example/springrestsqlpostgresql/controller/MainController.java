package com.example.springrestsqlpostgresql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String home() {
        return "Bem-vindo à API REST com Spring Boot e PostgreSQL!";
    }
}
