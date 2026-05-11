package com.sena.microservices.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;
import java.io.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

// @RestController
@Controller
@RequestMapping("/calculadora")
public class ControllerCalculadora {

    // Suma usando parámetros en la URL (request param)

    @GetMapping("/sumar1")
    @ResponseBody
    public int sumar1(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/sumar2")
    @ResponseBody
    public Map<String, Integer> sumar2(@RequestParam int a, @RequestParam int b) {
        Map<String, Integer> resultado = new HashMap<>();
        resultado.put("resultado", a + b);
        return resultado;
    }

    @GetMapping("/sumar-header")
    @ResponseBody
    public Map<String, Integer> sumarHeader(
        @RequestHeader("a") int a,
        @RequestHeader("b") int b) {
        Map<String, Integer> resultado = new HashMap<>();
        resultado.put("resultado", a + b);
        return resultado;
    }

    // Suma usando el cuerpo de la petición (request body)
    @PostMapping("/sumar")
    @ResponseBody
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

    @GetMapping("/sumar-archivo")
    @ResponseBody
    public Map<String, Integer> sumarArchivo() throws IOException {
        InputStream is = getClass().getClassLoader().getResourceAsStream("numeros.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        Map<String, Integer> resultado = new HashMap<>();
        resultado.put("resultado", a + b);
        return resultado;
    }

    @GetMapping("/formulario")
    public String mostrarFormulario() {
        return "formulario";
    }

    @PostMapping("/sumar-form")
    public String sumarForm(@RequestParam int a, @RequestParam int b, Model model) {
        model.addAttribute("resultado", a + b);
        return "formulario";
    }
}