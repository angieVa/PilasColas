package colecciones;

public class Balance {
	
	
	public Balance() {
		
	}
	
	public String balance(String word) {
		String result = "F";
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
						e.printStackTrace();
					}
					
					if(top.equals("(")) {
						
						if(String.valueOf(word.charAt(i)).equals("]")) {
							balanceado = false;
							result = "F";
						}else if(String.valueOf(word.charAt(i)).equals("}")) {
							balanceado = false;
							result = "F";
						}else if(String.valueOf(word.charAt(i)).equals(")")) {
							result = "T";
						}
						
						
			
					}else if(top.equals("[")) {
						
						if(String.valueOf(word.charAt(i)).equals("]")) {
							result = "T";
						}else if(String.valueOf(word.charAt(i)).equals("}")) {
							balanceado = false;
							result = "F";
						}else if(String.valueOf(word.charAt(i)).equals(")")) {
							balanceado = false;
							result = "F";
						}
						
					}else if(top.equals("{")) {
						
						if(String.valueOf(word.charAt(i)).equals("}")) {
							result = "T";
						}else if(String.valueOf(word.charAt(i)).equals("]")) {
							balanceado = false;
							result = "F";
						}else if(String.valueOf(word.charAt(i)).equals(")")) {
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
	
	
	
	
	
	
	
	

}
