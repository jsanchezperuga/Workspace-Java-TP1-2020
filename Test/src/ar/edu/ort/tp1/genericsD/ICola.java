package ar.edu.ort.tp1.genericsD;

public interface ICola<E> {
	
	public void add(E elemento);
	
	public E get();
	public E remove();
	public boolean isEmpty();
	public boolean isFull();
	
	
}