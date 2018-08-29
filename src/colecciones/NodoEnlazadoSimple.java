package colecciones;

public class NodoEnlazadoSimple<E> {
	
	private E elemento;
	private NodoEnlazadoSimple<E> siguiente;
	
	public NodoEnlazadoSimple(E elemento) {
		this.elemento = elemento;
		siguiente = null;
		
	}

	/**
	 * @return the elemento
	 */
	public E getElemento() {
		return elemento;
	}

	/**
	 * @param elemento the elemento to set
	 */
	public void setElemento(E elemento) {
		this.elemento = elemento;
	}

	/**
	 * @return the siguiente
	 */
	public NodoEnlazadoSimple<E> getSiguiente() {
		return siguiente;
	}

	/**
	 * @param siguiente the siguiente to set
	 */
	public void setSiguiente(NodoEnlazadoSimple<E> siguiente) {
		this.siguiente = siguiente;
	}

	

	

}
