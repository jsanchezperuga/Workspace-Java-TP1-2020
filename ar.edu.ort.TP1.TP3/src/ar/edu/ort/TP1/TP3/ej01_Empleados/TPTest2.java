package ar.edu.ort.TP1.TP3.ej01_Empleados;

public class TPTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		"Pedro" 25 100 200 5
//		"Maria" 30 100 200 10
		
		Vendedor pedro = new Vendedor("Pedro", 20, 100, 200, 5);
		Vendedor maria = new Vendedor("Maria",30, 100, 200, 10);
		
		System.out.println(pedro.toString());
		System.out.println(pedro.calcularPago());
		System.out.println(maria.toString());
		System.out.println(maria.calcularPago());
		
		Empleado e = new Empleado();
		Asalariado a = (Asalariado)e;

	}

}
