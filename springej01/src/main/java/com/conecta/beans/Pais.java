package com.conecta.beans;

import java.util.List;

public class Pais {

	private String nombre;
	private Cuidad ciudad;
	private List<Cuidad> ciudades;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cuidad getCuidad() {
		return ciudad;
	}

	public void setCuidad(Cuidad cuidad) {
		this.ciudad = cuidad;
	}

	public List<Cuidad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Cuidad> ciudades) {
		this.ciudades = ciudades;
	}
 
	
	
}
