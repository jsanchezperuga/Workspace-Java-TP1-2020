package ar.edu.ort.TP1.TP2.Ej1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1;
		persona1 = new Persona("Jeronimo","Sanchez");
		persona1.agregarMail("jero45@gmail.com");
		persona1.agregarMail("jeronimo.sanchez@ort.edu.ar");
		persona1.agregarTelefono(59, 11, 1537649155, TipoDeLinea.CELULAR);
		persona1.agregarTelefono(59, 11, 48330061, TipoDeLinea.FIJO);

		persona1.mostrarTodo();

	}

}
