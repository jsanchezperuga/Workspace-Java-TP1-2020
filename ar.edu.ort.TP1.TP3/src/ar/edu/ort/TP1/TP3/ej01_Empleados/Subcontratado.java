package ar.edu.ort.TP1.TP3.ej01_Empleados;

public class Subcontratado extends Empleado {

	private float cantHoras;
	private float precioHora;
	
	
	
	public Subcontratado() {
		super();
	}
	public Subcontratado(String nombre, int edad, int cantHoras, float precioHora) {
		super(nombre, edad);
		setPrecioHora(precioHora);
		setCantHoras(cantHoras);
	}
	
	public float getCantHoras() {
		return cantHoras;
	}
	public float getPrecioHora() {
		return precioHora;
	}
	private void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}
	private void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}
	@Override
	public String toString() {
		return "Subcontratado [ "+ "Nombre: " + getNombre() + " Edad: " + getEdad()  + "cantHoras=" + cantHoras + ", precioHora=" + precioHora + "]";
	}
	
	@Override
	public float calcularPago(){
		return getCantHoras()*getPrecioHora();
	}
	
	
	
	
}
