package com.practice.clases;

public class Calculadora {

	public Double areaCirculo(Double diametro){
		
		if(diametro <= 0) {
			return 0.00;
		}else {
			return Math.PI*Math.pow((diametro/2),2);
		}
		
	}
	
	public Double radioCirculo(Double diametro) {
		if(diametro <= 0) {
			return 0.00;
		}else {
			return diametro/2;
		}
	}
	
	public Double areaTriangulo(Double base, Double altura) {
		
		if(base <= 0 & altura <= 0) {
			return 0.0;
		} else {
			return base * altura / 2;
		}
	}
	
	public Double longitudTrapezoide (Double base1, Double base2, Double altura) {
		
		if (base1 <= 0 & base2 <= 0 & altura <= 0) {
			return 0.00;
		}else {
			return (base1 + base2)*altura;
		}
	}
	
	public Double areaTrapezoide (Double longitud) {
		if (longitud <= 0) {
			return 0.00;
		}else {
		return longitud/2;
		}
		
		//
	}

}
