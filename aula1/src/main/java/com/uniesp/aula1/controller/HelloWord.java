package com.uniesp.aula1.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Tudo que tiver o @ será anotação.
@SpringBootApplication
public class HelloWord {
    //Receber uma requisição
    @RequestMapping("/helloword") //Mapeando o endereço da requisição
    public String helloword() {
        return "Hello Word";
    }
}
