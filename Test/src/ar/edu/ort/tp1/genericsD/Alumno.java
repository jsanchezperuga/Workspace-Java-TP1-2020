package ar.edu.ort.tp1.genericsD;


public class Alumno extends Persona {
	
	private int numeroLegajo;

	public Alumno(int numeroLegajo, String nombreCompleto, int anioNacimiento){
		super(nombreCompleto, anioNacimiento);
		setNumeroLegajo(numeroLegajo);
	}
	
	
	
	
	
	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		// Completar
		
		this.numeroLegajo = numeroLegajo;
	}
	@Override
	public String toString(){
		String out="[nombreCompleto="+getNombreCompleto()+", numeroLegajo="+getNumeroLegajo()+", anioNacimiento="+getAnioNacimiento()+"]";
		return out;
	}
}
