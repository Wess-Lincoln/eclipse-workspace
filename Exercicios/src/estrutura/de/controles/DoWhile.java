package estrutura.de.controles;

import java.util.Scanner;



public class DoWhile {
	public static void main(String[] args) {
		
		//if (...) senten�a de c�digo; ou {}
		// while (...) senten�a de c�digo;ou {}
		// for (incializa a variav�l; Express�o; Modifica��o var)
		//senten�a de c�digo;ou {}
		//do senten�a de c�digo;ou {} while(...);
		
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
