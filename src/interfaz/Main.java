package interfaz;

import colecciones.Balance;
import colecciones.EstructuraGenerica;
import colecciones.Queque;
import colecciones.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
//		Stack<String> pila = new EstructuraGenerica<String>();
//		
//		pila.push("hola mundo" );
//		pila.push("MBLAQ");
//		pila.push("KPOP");
//		
//		try {
//			System.out.println(pila.top());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(pila.size());
//		
//		System.out.println(pila.pop());
//		
//		System.out.println(pila.size());
//		
//		System.out.println(pila.pop());
//		
//		System.out.println(pila.size());
//		
//		System.out.println(pila.pop());
//		
//		System.out.println(pila.size());
//		
//		System.out.println(pila.pop());
//		
//		
//		
//		
//		Queque<String> cola = new EstructuraGenerica<String>();
//		
//		cola.enqueque("Hola mundo");
//		cola.enqueque("KPOP");
//		cola.enqueque("Super junior");
//		System.out.println(cola.sizeQ());
//		
//		System.out.println(cola.dequeque());
//		
//		System.out.println(cola.sizeQ());
//		
//		System.out.println(cola.dequeque());
//		
//		System.out.println(cola.sizeQ());
//		
//		System.out.println(cola.dequeque());
//		
//		System.out.println(cola.sizeQ());
//		
//		System.out.println(cola.dequeque());
//		
		
		Balance balance = new Balance();
		
		System.out.println(balance.balance("{[[[]]()]"));
		
		
		
		
		
	}

}
