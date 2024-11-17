package com.example.springrestsqlpostgresql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/minha-rota")
public class MeuControlador {
    @GetMapping
    public String minhaRota() {
        return "Olá, mundo!";
    }
}
