package com.sena.microservices.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class ControllerCalculadora {

    // Suma usando parámetros en la URL (request param)
    @GetMapping("/sumar")
    public int sumar(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    // Suma usando el cuerpo de la petición (request body)
    @PostMapping("/sumar")
    public int sumarBody(@RequestBody SumaRequest request) {
        return request.getA() + request.getB();
    }

    // Clase interna para mapear el request body
    public static class SumaRequest {
        private int a;
        private int b;

        public int getA() { return a; }
        public void setA(int a) { this.a = a; }
        public int getB() { return b; }
        public void setB(int b) { this.b = b; }
    }
}