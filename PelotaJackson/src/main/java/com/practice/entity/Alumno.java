package com.practice.entity;

public class Alumno extends Usuario{
	
	Nota[] notas;
	
	ClaseAlumno[] nombreClase;
	
	double notaFinal = 0.00;
	
	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}

	public ClaseAlumno[] getNombreClase() {
		return nombreClase;
	}

	public void setNombreClase(ClaseAlumno[] nombreClase) {
		this.nombreClase = nombreClase;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	

}
