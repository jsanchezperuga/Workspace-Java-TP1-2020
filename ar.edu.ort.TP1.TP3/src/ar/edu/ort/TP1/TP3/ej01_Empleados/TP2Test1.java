package ar.edu.ort.TP1.TP3.ej01_Empleados;

public class TP2Test1 {

//	Un Asalariado de nombre "Jose" edad 30 gana 10000
//	Un SubContratado de nombre "Carlos" edad 23 quien trabajará 50 horas al mes a un precio de 100 cada una.

	public static void main(String[] args) {
		Asalariado jose = new Asalariado("Jose", 30, 10000);
		Subcontratado carlos = new Subcontratado("Carlos", 23, 50, 100);
		
		System.out.println(jose.getClass() + " " + jose.getNombre() + " gana: " + jose.calcularPago());
		System.out.println(carlos.getClass() + " " + carlos.getNombre() + " gana: " + carlos.calcularPago());
	}

}
