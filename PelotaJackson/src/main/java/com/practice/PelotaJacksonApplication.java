package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.clases.Calculadora;
import com.practice.controller.PelotaController;

@SpringBootApplication
public class PelotaJacksonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PelotaJacksonApplication.class, args);
		
		//Calculadora calculos = new Calculadora();
		//PelotaController cal = new PelotaController();
		
		/*System.out.println("El diametro es: "+calculos.Diametro());
		System.out.println("El area es: "+calculos.Area());
		System.out.println("El area es: "+calculos.Mensaje());
		System.out.println(cal.ballDescription(null));*/
		
		//PelotaController cont = new PelotaController();
		//System.out.println("El diametro es: "+cont.ballDescription(""));
		
	}

}
