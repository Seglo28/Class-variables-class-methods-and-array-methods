package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.controller.personaController;

@SpringBootApplication
public class UsingJacksonApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsingJacksonApplication.class, args);
		
		System.out.println("hola");
	}

}
