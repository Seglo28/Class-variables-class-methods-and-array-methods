package com.practice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.clases.Calculadora;
import com.practice.entity.Alumno;
import com.practice.entity.Nota;
import com.practice.entity.PelotaEntity;
import com.practice.entity.PelotasEntities;
import com.practice.entity.TextosEntity;
import com.practice.entity.TrapezoideEntity;
import com.practice.entity.TrianguloEntity;
import com.practice.entity.Usuario;


@RestController
@RequestMapping("/figuras")
public class PelotaController {
	
	Calculadora calcu = new Calculadora();
	
	@PostMapping("/cirulo")
	public PelotaEntity calculosCirculo(@RequestBody PelotaEntity ball) {
		ball.setRadio(calcu.radioCirculo(ball.getDiametro()));
		ball.setArea(calcu.areaCirculo(ball.getDiametro()));
		
		return ball;
	}
	
	@PostMapping("/pelotas")
	public PelotasEntities calculosCirculo(@RequestBody PelotasEntities pelotas) {
		return pelotas;
	}
	
	@PostMapping("/circulos")
	public PelotaEntity[] calculosCirculo(@RequestBody PelotaEntity[] pelotas) {
		
		for(PelotaEntity ball : pelotas) {
			ball.setRadio(calcu.radioCirculo(ball.getDiametro()));
			ball.setArea(calcu.areaCirculo(ball.getDiametro()));
		}
		
		return pelotas;
	}
	
	@PostMapping("/listatexto")
	public String calculosCirculo(@RequestBody String[] args) {
		
		String salida = "";
		for(String arg : args) {
			salida += arg + ",";
		}
		
		return salida;
	}
	
	@PostMapping("/tabla")
	public String multiplicacion (@RequestParam int tablaDeMultiplicar) {
		String salida = "";
		for(int i = 1; i <= 10; i++) {
			salida += i + " x " + tablaDeMultiplicar + " = " + (i * tablaDeMultiplicar) + "\n"; 
		}
		return salida;
	}
	
	@PostMapping("/suma")
	public String SumaEnteros (@RequestBody int[] datos) {
		String salida = "0";
		int sumador = 0;
		
		if(datos.length <= 0) {
			return salida;
		} else {
			for(int i = 0; i < datos.length; i++) {
				sumador += datos[i];
			}
			
			salida = "la suma total es: " + sumador;
		}
		return salida;
	}
	
	@PostMapping("/impar")
	public String impares (@RequestBody int[] numeros) {
		String salida = "No ingreso datos.-";
		int contador = 0;
		int calculoSuma = 0;
			
				if(numeros.length % 2 == 0 ){
					for(int i = 0; i< numeros.length; i++) {	
						contador += numeros[i];
					}
					calculoSuma = numeros.length;
					salida = "La suma total es: "+contador+ "de "+calculoSuma;
				}else {				
					for(int i = 0; i< numeros.length; i++) {
						contador -= numeros[i];
					}
					salida = "La resta total es: "+contador;
				}
				return salida;
	}
	
	@PostMapping("/listaUsuarios")
	public Alumno[] listaUsuarioss (@RequestBody Alumno[] listaUsuarios ) {
		//Salida
		for(Alumno usuario: listaUsuarios) {
			double contador = this.getSumatoriaNotas(usuario.getNotas());
			usuario.setNotaFinal(contador/usuario.getNotas().length);
		}
		
		return listaUsuarios;
		
	}
	
	private double getSumatoriaNotas(Nota[] notas) {
		double salida = 0.0;
		
		for(Nota nota : notas) {
			
			salida += nota.getValor();
			
		}
		
		return salida;
	}
	
	@PostMapping("/listaGloria")
	public String textos(@RequestBody TextosEntity[] listaDeTextosEntity) {
		
		String salida = "";
		
		
		for(TextosEntity  arg: listaDeTextosEntity) {
			salida += arg.getTexto() + ",";
		
		
		/*for(int j = 0; j < listaDeTextosEntity.length; j++) {
			TextosEntity te = listaDeTextosEntity[j];*/
			//salida += te.getTexto();
		}

		
		
		
		/*for(int i = 0; i < listaDeTextosEntity.length; i++) {
			salida += listaDeTextosEntity[i].getTexto() + ", ";
		}*/
		
		
		
		return salida;
	}
	
	@PostMapping("triangulo")
	public TrianguloEntity calculosTriangulo(@RequestBody TrianguloEntity triangulo) {
		triangulo.setArea(calcu.areaTriangulo(triangulo.getBase(), triangulo.getAltura()));
		return triangulo;
	}
	
	@PostMapping("trapezoide")
	public TrapezoideEntity calculosTrapezoide(@RequestBody TrapezoideEntity trap) {
		trap.setLongitud(calcu.longitudTrapezoide(trap.getBase1(), trap.getBase2(), trap.getAltura()));
		trap.setArea(calcu.areaTrapezoide(trap.getLongitud()));
		return trap;
	}
}
