package colecciones;

import colecciones.NodoEnlazadoSimple;

public class ListaEnlazadaSimple<E> implements IListaEnlazadaSimple<E>{
	

	private NodoEnlazadoSimple<E> primero;
	private int longitud;
	
	
	public ListaEnlazadaSimple() {
		primero = null;
		longitud = 0;
	}
	
//LISTA ENLAZADA SIMPLE
	
	@Override
	public boolean agregar(E t) {
		
		NodoEnlazadoSimple<E> nuevo = new NodoEnlazadoSimple<E>(t);
		
		boolean agregado = false;
		
		if(estaVacia()) {
			primero = nuevo;
			agregado = true;
			longitud++;
		}else {
			
			NodoEnlazadoSimple<E> auxiliar = primero;
			
			while(auxiliar.getSiguiente() != null) {
				auxiliar =  auxiliar.getSiguiente();
			}
			
			auxiliar.setSiguiente(nuevo);
			agregado = true;
			longitud++;
		}
		return agregado;
	}
	
	public boolean asignar(int pos, E t) {
		boolean modificado = false;
		
		if(pos >= 0 && pos<longitud) {
			
			if(pos == 0) {
				
				primero.setElemento(t);
				modificado = true;
				
			}else {
				
				NodoEnlazadoSimple<E> auxiliar = primero;
				
				for(int i = 0; i < pos; i++) {
					
					auxiliar = auxiliar.getSiguiente();
				}
				
				auxiliar.setElemento(t);
				modificado = true;
				
			}
			
		}
		return modificado;
	}
	
	
	
	@Override
	public boolean agregarPorPosicion(int pos, E t) {
		boolean asignado = false;
		
		if(pos >=0 && pos<= longitud) {
			NodoEnlazadoSimple<E> nuevo = new NodoEnlazadoSimple<E>(t);
			if(pos == 0) {
				nuevo.setSiguiente(primero);
				primero = nuevo;
				 asignado = true;
			}else {
				
				if(pos == longitud) {
					NodoEnlazadoSimple<E> auxiliar = primero;
					while(auxiliar.getSiguiente() != null) {
						auxiliar =  auxiliar.getSiguiente();
					}
					
					auxiliar.setSiguiente(nuevo);
					
				}else {
					
					NodoEnlazadoSimple<E> auxiliar = primero;
					
					for (int i = 0; i < pos-1; i++) {
						auxiliar =  auxiliar.getSiguiente();
						
					}
					
					NodoEnlazadoSimple<E> siguiente = auxiliar.getSiguiente();
					auxiliar.setSiguiente(nuevo);
					nuevo.setSiguiente(siguiente);
					 asignado = true;
					
				}
				
			}
			
			longitud++;
		}
		
		
		
		return asignado;
	}
	@Override
	public boolean eliminar(E t) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E eliminar(int pos) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public int longitud() {
		// TODO Auto-generated method stub
		return longitud;
	}
	

	@Override
	public boolean estaElemento(E t) {

		NodoEnlazadoSimple<E> auxiliar = primero;
		boolean encontrado = false;
		
	
		while(auxiliar != null && !encontrado) {
			
			if(t.equals(auxiliar.getElemento())) {
				encontrado = true;
				
			}else {
				
				auxiliar = auxiliar.getSiguiente();
			}
		}

		return encontrado;
	}
	
	
	
	@Override
	public int buscar(E t) throws Exception {
		
		if(estaElemento(t)) {
			NodoEnlazadoSimple<E> auxiliar = primero;
			int posicion = 0;
			
			while(t != auxiliar.getElemento()) {
				
				posicion++;
				auxiliar = auxiliar.getSiguiente();
				
			}
			
			return posicion;
			
			
		}else {
			throw new Exception("Objeto inexistente");
		}
	
	}
	
	@Override
	public E obtenerElemento(int pos){
	
		E objeto = null;
		
		if(pos >= 0 && pos<longitud) {
			
			if(pos == 0) {
				
				objeto =  primero.getElemento();
			}else {
				NodoEnlazadoSimple<E> auxiliar = primero;
				
				for(int i = 0; i< pos; i++) {
					auxiliar = auxiliar.getSiguiente();
				}
				
				objeto = auxiliar.getElemento();
				
			}
		}
		return objeto;
	}
	
	
	
	@Override
	public boolean estaVacia() {
	
		return primero == null;
	}
	@Override
	public boolean eliminarTodos() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

    

}
