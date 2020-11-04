package ar.edu.ort.TP1.TP2.Ej1;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList <NumeroTelefonico> nrosTelefono;
	private ArrayList<EMail> eMails;
		
	public Persona(String nom, String apel){
		nrosTelefono = new ArrayList<>();
		eMails = new ArrayList<>();	
		this.setApellido(apel);
		this.setNombre(nom);
	}
	
	public void agregarTelefono(int codPais, int caract, int abonado, TipoDeLinea tipo){
		NumeroTelefonico nuevoNumero = new NumeroTelefonico(codPais,caract,abonado,tipo);
		this.nrosTelefono.add(nuevoNumero);
	}
	
	public void agregarMail(String direccion){
		EMail nuevoEmail = new EMail(direccion);
		eMails.add(nuevoEmail);
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void mostrarTodo(){
//		Messi, Lionel
//		Telefonos:
//		Celular: 549-114111-2222
//		Celular: 068-032444-5678 Fijo: 054-4411-5472 email: lio@messi.com 
		
		System.out.println(this.getApellido() + ", " + this.getNombre());
		System.out.println("Tel�fonos:");
		mostrarTelefonos();
		mostrarMails();
	}

	private void mostrarMails() {
		for(EMail mail : this.eMails){
			System.out.println("email : " + mail.getValor());
		}
	}

	private void mostrarTelefonos() {
		for(NumeroTelefonico num : this.nrosTelefono){
			System.out.println(num.getTipo() + ": " + num.getValor()); 
		}
	}	
}
