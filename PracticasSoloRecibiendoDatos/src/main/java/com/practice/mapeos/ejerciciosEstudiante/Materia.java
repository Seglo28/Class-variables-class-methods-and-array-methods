package com.practice.mapeos.ejerciciosEstudiante;

public class Materia {

	private String nombreMateria = "";
	private int nota = 0;
	
	//Getters and Setters
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	//Constructores
	
	
	public Materia(String nombreMateria, int nota) {
		super();
		this.nombreMateria = nombreMateria;
		this.nota = nota;
	}
	public Materia() {
		super();
	}
	
	
	
}
