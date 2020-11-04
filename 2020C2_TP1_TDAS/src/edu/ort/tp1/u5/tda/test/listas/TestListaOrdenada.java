package edu.ort.tp1.u5.tda.test.listas;

import java.util.Iterator;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class TestListaOrdenada {

	// Declaro las dos listas con las que voy a querer mantener ordenados los
	// empleados.
	private static EmpleadosPorLegajo listaPorLegajo;
	private static EmpleadosPorNombre listaPorNombre;
	private static PersonasPorDNI personas;

	public static void main(String[] args) {
		// Inicializo ambas clases
		listaPorLegajo = new EmpleadosPorLegajo();
		listaPorNombre = new EmpleadosPorNombre();
		personas = new PersonasPorDNI();
		
		personas.add(new Persona(12345678, "Juancito"));
		personas.add(new Persona(20202020, "Pancracio"));

		// Agrego los empleados a ambas listas
		agregarEmpleado(5, "Sebastian");
		agregarEmpleado(3, "Mariano");
		agregarEmpleado(7, "Nir");
		agregarEmpleado(1, "Gaby");
		agregarEmpleado(2, "Dany");
		agregarEmpleado(4, "Carlos");
		agregarEmpleado(8, "Sebastian");

		// listo los empleados ordenados de dos formas distintas (por legajo y
		// por nombre)
		listar(listaPorLegajo);
		listar(listaPorNombre);

		System.out.println("Busco al primero cuyo nombre empiece con 'G'");
		System.out.println(buscarNombreQueEmpieceCon(listaPorNombre, "G"));

		System.out.println("Busco al primero cuyo nombre empiece con 'Z'");
		System.out.println(buscarNombreQueEmpieceCon(listaPorNombre, "Z"));

		// Elimino a uno de los empleados de una de las listas
		System.out.println("Eliminando a Dany de la lista por legajo...");
		Empleado e = listaPorLegajo.removeByKey(new Integer(2));

		// muestro el empleado removido
		System.out.println("Se removio a " + e);

		System.out.println("Sin embargo, el empleado 'sobrevive' en la lista por nombre");
		listar(listaPorLegajo);
		listar(listaPorNombre);

		// lo removemos de la segunda lista y volvemos a mostrar la lista por
		// nombre
		System.out.println("Eliminando a Dany de la lista por nombre...");
		e = listaPorNombre.removeByKey("Dany");

		// muestro el empleado removido
		System.out.println("Se removio a " + e);

		listar(listaPorNombre);
		/*
		for (Persona p: personas) {
			System.out.println(p);
		}
		*/
		listar(personas);
	}

	private static Empleado buscarNombreQueEmpieceCon(EmpleadosPorNombre listaPorNombre, String comienzo) {
		Iterator<Empleado> iterator = listaPorNombre.iterator();
		Empleado empleado = null;
		Empleado empleadoBuscado = null;
		while (iterator.hasNext() && empleadoBuscado == null) {
			empleado = iterator.next();
			if (empleado.getNombre().startsWith(comienzo)) {
				empleadoBuscado = empleado;
			}
		}
		return empleadoBuscado;
	}

	private static void agregarEmpleado(int legajo, String nombre) {
		System.out.println("Agrego " + legajo + " - " + nombre + " en ambas listas");
		Empleado e = new Empleado(legajo, nombre);
		listaPorLegajo.add(e);
		listaPorNombre.add(e);
	}

	private static void listar(ListaOrdenadaNodos<?, ?> lista) {
		System.out.println(String.join(" ", lista.getClass().getSimpleName().split("(?=\\p{Upper})")));
		for (Object elemento : lista) {
			System.out.println(elemento);
		}
	}

}