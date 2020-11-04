package ort.tp1.tdas.ejercicios.ej3.clases;

import ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaDeTerminos extends ListaOrdenadaNodos<String, Termino>{

	@Override
	public int compare(Termino dato1, Termino dato2) {
		// TODO Auto-generated method stub
		return dato1.getClave().compareToIgnoreCase(dato2.getClave());
	}

	@Override
	public int compareByKey(String clave, Termino elemento) {
		// TODO Auto-generated method stub
		return clave.compareToIgnoreCase(elemento.getClave());
	}

}
