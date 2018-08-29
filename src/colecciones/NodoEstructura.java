package colecciones;

public class NodoEstructura<A> {
	
	private A element;
	
	private NodoEstructura<A> next;

	public NodoEstructura(A element) {
		this.element = element;
		this.next = null;
	}

	/**
	 * @return the element
	 */
	public A getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(A element) {
		this.element = element;
	}

	/**
	 * @return the next
	 */
	public NodoEstructura<A> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(NodoEstructura<A> next) {
		this.next = next;
	}
	
	
	
	
	
}
