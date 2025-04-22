package com.example.demo.service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello() {
        return "Hola, bienvenido a la pagina web";
    }

}
