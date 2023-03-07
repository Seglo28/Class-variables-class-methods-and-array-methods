package com.practice.mapeos.ejercicioVehiculos;

public class Auto {
	private String marca = "";
	private int precio = 0;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Auto() {
		super();
	}
	public Auto(String marca, int precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}
}
