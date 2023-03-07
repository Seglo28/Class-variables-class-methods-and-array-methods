package com.practice.mapeos.ejerciciosEstudiante;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Estudiante {
	
	
	//Variables 
	@JsonProperty(value="student_id")
	private String id = "";
	private Materia materia;
	
	
	//Getters and Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	//Constructores
	
	public Estudiante(String id, Materia materia) {
		super();
		this.id = id;
		this.materia = materia;
	}
	public Estudiante() {
		super();
	}
	
	
	
}
