package ar.edu.ort.tp1.genericsD;

import java.util.ArrayList;

public class Pila<E> implements IPila<E> {
	
	private int topePila;
	private ArrayList<E> listaPila;

	public Pila(int topePila) {		
		setTopePila(topePila);
		listaPila = new ArrayList<E>();
	}

	public Pila() {
		listaPila = new ArrayList<E>();
	}


	private void setTopePila(int topePila) {
		this.topePila = topePila;
		
	}

	@Override
	public void push(E elemento) {
		if (this.isFull()) {			
			throw new RuntimeException("La pila esta llena");			
		} 			
			listaPila.add(elemento);			
			System.out.println("Objeto agregado");
	}
	

	@Override
	public E pop() {
		if(this.isEmpty()) {
			throw new RuntimeException("La pila esta vacia");
		}
		int i = listaPila.size()-1;		
		return listaPila.remove(i);
	}

	@Override
	public E peek() {
		int i = listaPila.size()-1;
		return listaPila.get(i);
	}

	@Override
	public boolean isEmpty() {
		return listaPila.isEmpty();
	}

	@Override
	public boolean isFull() {
		return listaPila.size() == topePila;
	}

}
