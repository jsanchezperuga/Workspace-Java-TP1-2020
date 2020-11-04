package edu.ort.tp1.u5.tda.test.listas;

public class Persona {
	private int dni;
	private String nombre;
	public Persona(int dni, String nombre) {
		setDni(dni);
		setNombre(nombre);
	}
	public int getDni() {
		return dni;
	}
	private void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	
	
}
