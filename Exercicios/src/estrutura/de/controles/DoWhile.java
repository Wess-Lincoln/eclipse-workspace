package estrutura.de.controles;

import java.util.Scanner;



public class DoWhile {
	public static void main(String[] args) {
		
		//if (...) sentença de código; ou {}
		// while (...) sentença de código;ou {}
		// for (incializa a variavél; Expressão; Modificação var)
		//sentença de código;ou {}
		//do sentença de código;ou {} while(...);
		
	Scanner entrada = new Scanner(System.in);
	String texto = "";
	
	do {System.out.println ("Digite algumas "
			+ "palavras magicas...");
	System.out.println("Quer sair?");
	texto= entrada.nextLine();
	}
	while(!texto.equalsIgnoreCase("por favor"));
	
	System.out.println ( "obrigado");
	
	
	entrada.close();
	}
}
