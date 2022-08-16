package com.uniesp.Aulas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ControllerApplication {

	@RequestMapping
	public static void main(String[] args) {
		SpringApplication.run(ControllerApplication.class, args);
	}
}