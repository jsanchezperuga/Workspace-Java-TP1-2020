package ort.tp1.tdas.ejercicios.ej1;

import ort.tp1.tdas.ejercicios.ej1.clases.FabricanteDePelotas;
import ort.tp1.tdas.ejercicios.ej1.clases.PelotaDeTenis;
import ort.tp1.tdas.ejercicios.ej1.clases.TuboPelotasDeTenis;
import ort.tp1.tdas.implementaciones.PilaNodos;
import ort.tp1.tdas.interfaces.Pila;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Obtener un tubo de pelotas de tenis del Fabricante
		TuboPelotasDeTenis tuboDePelotas = FabricanteDePelotas.fabricarTubo();

		// Sacar una pelota del tubo, usara una vez y volverla la guardar.
		PelotaDeTenis pelota = tuboDePelotas.extraer();
		pelota.usar();
		tuboDePelotas.guardar(pelota);
		
		// Desarrollar el metodo nombrado a continuacion.
		// Debe quedar tal como estaba al recibirlo.
		listarContenidoTubo(tuboDePelotas);
	}

	private static void listarContenidoTubo(TuboPelotasDeTenis tuboDePelotas) {
		// TODO completar
	}

}
