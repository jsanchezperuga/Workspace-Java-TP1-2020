package ar.edu.ort.TP1.TP3.ej01_Empleados;

public class Vendedor extends Subcontratado {
//	 Crear la clase Vendedor, la cual heredará de SubContratado. Deberá 
//	 tener un atributo float porcentaje, el método toString() y 
//	 calcularPago(). Cobrará de manera similar que cualquier otro 
//	 subcontratado, salvo que además del jornal cobrará un porcentaje 
//	 extra aplicado al importe de las ventas realizadas en el mes.
//	 ● (precioHora * cantHoras ) * 1.porcentaje
	
	private float porcentaje;
	
	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String nombre, int edad, int cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		setPorcentaje(porcentaje);
		// TODO Auto-generated constructor stub
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	private void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " porcentaje:  " + getPorcentaje();
	}

	@Override
	public float calcularPago() {
		float pago = super.calcularPago();
		return pago + (pago*(getPorcentaje()/100)); 
	}
	
	
	
	
}
