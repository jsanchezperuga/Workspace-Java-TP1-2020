package edu.ort.tp1.u5.tda.test.listas;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class PersonasPorDNI extends ListaOrdenadaNodos<Integer, Persona> {

	@Override
	public int compare(Persona dato1, Persona dato2) {
		return dato1.getDni() - dato2.getDni();
	}

	@Override
	public int compareByKey(Integer clave, Persona elemento) {
		return clave - elemento.getDni();
	}

}
