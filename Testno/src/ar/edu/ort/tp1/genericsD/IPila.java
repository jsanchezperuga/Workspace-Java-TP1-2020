package ar.edu.ort.tp1.genericsD;

public interface IPila<E> {
	
	public void push(E elemento);
	public E pop(); // remueve
	public E peek(); // devuelve sin remover
	public boolean isEmpty();
	public boolean isFull();
}
