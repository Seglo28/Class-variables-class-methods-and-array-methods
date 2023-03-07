package com.practice.mapeos.ejerciciosEmpleado;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class Empleado {
	
	//@JsonProperty(access = Access.WRITE_ONLY)
	private String name = "";
	//@JsonProperty(access = Access.WRITE_ONLY)
	private int salary = 0;
	@JsonProperty(access = Access.WRITE_ONLY)
	private int totalPago = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getTotalPago() {
		return totalPago;
	}
	public void setTotalPago(int totalPago) {
		this.totalPago = totalPago;
	}
	public Empleado() {
		super();
	}
	public Empleado(String name, int salary, int totalPago) {
		super();
		this.name = name;
		this.salary = salary;
		this.totalPago= totalPago;
	}
}
