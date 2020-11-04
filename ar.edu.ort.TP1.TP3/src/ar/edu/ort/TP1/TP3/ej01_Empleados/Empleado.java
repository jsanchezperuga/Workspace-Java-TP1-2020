package ar.edu.ort.TP1.TP3.ej01_Empleados;

public class Empleado {
		
	private String nombre;
	private int edad;
	
	public Empleado() {
	}	
	
	public Empleado(String nombre, int edad) {
		setNombre(nombre);
		setEdad(edad);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString(){
		return "[Nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public float calcularPago(){
		return 0.0f; 
	}
}
