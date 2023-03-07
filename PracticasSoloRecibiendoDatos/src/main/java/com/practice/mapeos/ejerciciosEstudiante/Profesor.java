package com.practice.mapeos.ejerciciosEstudiante;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class Profesor {

	//Variables
	@JsonProperty(access = Access.WRITE_ONLY)
	private String id = "AA1234";
	@JsonProperty(access = Access.WRITE_ONLY)
	private String nombre = "";
	private int grado = 0;
	private Estudiante[] alumnos;
	
	//Getters and Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getGrado() {
		return grado;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
	public Estudiante[] getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Estudiante[] alumnos) {
		this.alumnos = alumnos;
	}

	
	//Constructores
	
	public Profesor(String id, String nombre, int grado, Estudiante[] alumnos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.grado = grado;
		this.alumnos = alumnos;
	}
	
	public Profesor() {
		super();
	}
}
