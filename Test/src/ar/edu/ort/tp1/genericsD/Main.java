package ar.edu.ort.tp1.genericsD;

public class Main {

	public static void main(String[] args) {
	
		
		
		Cola <Persona> colaDePersona = new Cola<Persona>(2);
		
		Pila <Persona> pilaDePersona = new Pila<Persona>(2);
		
		Alumno a1 = new Alumno(1000,"asdas",1000);
		
		Persona p2 = new Persona("Ajeje", 1995);
		
		try {
		
		colaDePersona.add(a1);
		
		colaDePersona.add(p2); 
		
		pilaDePersona.push(a1);
		
		
		}catch (Exception e) {
			
		System.out.println(e.getMessage());

		}
		
		System.out.println(pilaDePersona.peek());
		
		System.out.println(pilaDePersona.pop());
		
		
		try {
			System.out.println(pilaDePersona.peek());
		}
	catch (Exception e) {
		
		System.out.println(e.getMessage());
		// TODO: handle exception
	}
		
/*		System.out.println(colaDePersona.get().toString());
		
		colaDePersona.remove();
		System.out.println(colaDePersona.get().toString());*/
		

		
	}

}
