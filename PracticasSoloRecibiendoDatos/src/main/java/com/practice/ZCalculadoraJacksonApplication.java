package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.controller.Controlador;
import com.practice.mapeos.ejerciciosEstudiante.Profesor;

@SpringBootApplication
public class ZCalculadoraJacksonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZCalculadoraJacksonApplication.class, args);
		
		Controlador control = new Controlador();
		
		Profesor p = new Profesor();
		
		System.out.println(p.getId());
		
		
		
	}

}
