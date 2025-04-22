package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service

public class CalculadoraService {
    public Double dividir(Double a, Double b) {
        if(a == null || b == null  ){
            throw new IllegalArgumentException("a y b no pueden ser nulos");
        }
        if(b == 0){
            throw new ArithmeticException("b no pueden ser 0");
        }
        return a / b;
    }
}
