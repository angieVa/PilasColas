package interfaz;

import java.io.IOException;
import java.util.Scanner;

import colecciones.EstructuraGenerica;
import colecciones.Queque;
import colecciones.Stack;
import tarea.Balance;

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
		
		System.out.println("Ingrese los datos");
		
		try {
		balance.leer();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
