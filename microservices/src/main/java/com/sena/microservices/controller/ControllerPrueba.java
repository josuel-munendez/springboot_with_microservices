package com.sena.microservices.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerPrueba {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "<h1>Bienvenido a Java Spring</h1>";
    }
    @GetMapping("/test2")
    @ResponseBody
    public  int test2(){
        return 10;
    }

    @DeleteMapping("/eliminar")
    public String delete(){
        return "Eliminar";
    }

    @PutMapping("/put")
    public  String put(){
        return " con metodo put";
    }
}
