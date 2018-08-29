package tarea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import colecciones.EstructuraGenerica;
import colecciones.Stack;

public class Balance {
	
	
	public Balance() {
		
	}
	
	public String balance(String word) {
		String result = "T";
		Stack<String> pila = new EstructuraGenerica<String>();
		
		if(word == null) {
			result = "F";
		}else if(word.equals("")) {
			
			result = "T";
			
		}else {
			
			
			boolean balanceado = true;
			
			for(int i = 0; i < word.length() && balanceado == true; i++) {
				
				if(String.valueOf(word.charAt(i)).equals("(")  || String.valueOf(word.charAt(i)).equals("[") || String.valueOf(word.charAt(i)).equals("{")) {
					
					pila.push(String.valueOf(word.charAt(i)));
					
					
				}else if(String.valueOf(word.charAt(i)).equals(")") || String.valueOf(word.charAt(i)).equals("]") || String.valueOf(word.charAt(i)).equals("}")) {
					
					String top = "";
					try {
						top = pila.pop();
					} catch (Exception e) {
						result = "F";
						e.getMessage();
					}
					
					if(top.equals("(")) {
						
						if(String.valueOf(word.charAt(i)).equals(")")) {
							result = "T";
						}else {
							balanceado = false;
							result = "F";
						}

					}else if(top.equals("[")) {
						
						if(String.valueOf(word.charAt(i)).equals("]")) {
							result = "T";
						}else {
							balanceado = false;
							result = "F";
						}
						
					}else if(top.equals("{")) {
						
						if(String.valueOf(word.charAt(i)).equals("}")) {
							result = "T";
						}else {
							balanceado = false;
							result = "F";
						}
						
						
					}
					
				}
				
				
			}
			
			
		}
		
		if(pila.isEmpty() == false) {
			result = "F";
		}
		
		
		return result;
	}
	
	
	public void leer() throws IOException{
		
		String resultado = "";
		String ruta = "datos/testCases.txt";
		
		FileReader fr = new FileReader(ruta);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long casos = Long.parseLong(br.readLine());
		String linea = "";
		
		for(long i = 0; i< casos; i++) {
			
			linea = br.readLine();
			
			resultado = balance(linea);
			bw.write(resultado);
			bw.write("\n");
			bw.flush();
		
		}
		
	


	}
	
	
	
	
	
	
	
	

}
