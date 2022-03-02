package estrutura.de.controles;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
	
	
	Scanner entrada = new Scanner(System.in);
	
	String palavra = "";
	
	while(!palavra.equalsIgnoreCase("sair")) {
		System.out.print("Diga algo:");
		palavra = entrada.nextLine();
		
	}
	
	
	
	
	
	
	
	
	entrada.close();
	

}
}