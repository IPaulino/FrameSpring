package com.uniesp.Aulas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Classe controladora, rebecer as requisições, classes que recebem e armazenam.
@RequestMapping
public class HelloWorld {

    @GetMapping("/")
    public static String main() {
        return "Hello World";
    }
}
