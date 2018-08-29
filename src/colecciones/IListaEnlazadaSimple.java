package colecciones;

public interface IListaEnlazadaSimple<T> {
	
	public boolean agregar(T t);
	public boolean asignar(int pos, T t);
	public boolean eliminar(T t);
	public T eliminar(int pos);
	public int longitud();
	public boolean estaElemento(T t);
	public int buscar(T t) throws Exception;
	public T obtenerElemento(int pos);
	public boolean estaVacia();
	public boolean eliminarTodos();
	boolean agregarPorPosicion(int pos, T t);
	

	
}
