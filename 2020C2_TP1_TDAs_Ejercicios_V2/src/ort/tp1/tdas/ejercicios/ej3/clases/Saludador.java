package ort.tp1.tdas.ejercicios.ej3.clases;

import java.util.Scanner;

/**
 * Esta clase debe:
 * - Cargar uno o mas diccionarios (uno en cada idioma, al menos dos) para que pueda:
 *    -- Mostrar errores
 *    -- Dar la bienvenida
 *    -- Solicitar un nombre (para que el Saludador lo pida por teclado).
 *    -- Decirle que tiene un lindo nombre
 *    -- Mostrar un saludo de despedida usando el nombre pedido por teclado.
 * - Elegir un idioma
 * - Ejecutar una rutima que:
 *   -- Salude
 *   -- Pida el nombre
 *   -- Lo cargue por teclado
 *   -- Diga que es un lindo nombre
 *   -- Despedir usando el nombre
 */
public class Saludador {

	private Diccionario diccionario;
	private String idioma;
	private Scanner input;
	
	public Saludador(String idioma) {
		// TODO -- Completar
		diccionario = new Diccionario();
		cargarDiccionario(diccionario);
		elegirIdioma(idioma);
	}

	private void cargarDiccionario(Diccionario diccionario) {
		// TODO -Carga los diccionarios de los distintos idiomas
		diccionario.agregarIdioma("ES", "Espa�ol");

		diccionario.agregarTermino("ES", "BIENVENIDA", "�Te damos la benvenida!");
		diccionario.agregarTermino("ES", "INGRESAR_NOMBRE", "Ingrese su nombre, por favor:");
		diccionario.agregarTermino("ES", "LINDONOMBRE", "�Qu� lindo nombre!");
		diccionario.agregarTermino("ES", "DESPEDIDA", "�Hasta luego! Esperamos verte pronto de nuevo, ");
		diccionario.agregarTermino("ES", "IDIOMA_INVALIDO", "�Hubo un error!");
		
		diccionario.agregarIdioma("EN", "Ingl�s");
		diccionario.agregarTermino("EN", "BIENVENIDA", "�Welcome!");
		diccionario.agregarTermino("EN", "INGRESAR_NOMBRE", "Enter your name, please:");
		diccionario.agregarTermino("EN", "LINDONOMBRE", "�That's a cute name!");
		diccionario.agregarTermino("EN", "DESPEDIDA", "�Good bye! We hope to see you again soon, ");
		diccionario.agregarTermino("EN", "IDIOMA_INVALIDO", "�Something went wrong!");
	}

	public void elegirIdioma(String idioma) throws RuntimeException {
		if (diccionario.idiomaValido(idioma)) {
			this.idioma = idioma;
		} else {
			throw new RuntimeException(diccionario.obtenerTermino(this.idioma, "IDIOMA_INVALIDO"));
		}
	}

	private String getTermByKey(String key){
		return this.diccionario.obtenerTermino(this.idioma, key);
	}
	
	public void run() {

		input = new Scanner(System.in);
		String nombre;
		// TODO - Usa lo definido en el resto de la clase
		System.out.println(getTermByKey("BIENVENIDA"));
		System.out.println(getTermByKey("INGRESAR_NOMBRE"));
		nombre = input.nextLine();
		System.out.println(getTermByKey("LINDONOMBRE"));
		System.out.println(getTermByKey("DESPEDIDA") + nombre);	
		//input.close();
	}

}
