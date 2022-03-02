package exercicioslivres;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		
	
		System.out.println("Digite um numero para tabuada:");
		Scanner entrada=new Scanner(System.in);
		
		String tabuada =  entrada.next();
	    int valorTabuada = Integer.parseInt(tabuada);
	    
	    	for (int valor = 1; valor <= 10; valor++) {
	   
	    		System.out.println(valorTabuada + "x" + valor + "=" +
	    		(valorTabuada*valor));
	    		
	    entrada.close();		
		}
	    	 
	    }
	
}
		
		
	


