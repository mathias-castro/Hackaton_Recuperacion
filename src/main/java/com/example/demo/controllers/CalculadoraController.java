package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("dividir/{a}/{b}")
    public ResponseEntity<?> Dividir(@PathVariable Double a, @PathVariable Double b) {
        try {
            Double resultado = calculadoraService.dividir(a, b);
            return ResponseEntity.ok(resultado);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("Error Aritmetico: " + e.getMessage());
        }
    }
}
