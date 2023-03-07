package com.practice.mapeos.ejercicioVehiculos;

public class Persona {
	private String name = "";
	Auto auto;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	public Persona() {
		super();
	}
	public Persona(String name, Auto auto) {
		super();
		this.name = name;
		this.auto = auto;
	}
	
	
}
