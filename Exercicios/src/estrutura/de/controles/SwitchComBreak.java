package estrutura.de.controles;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma nota:");
		int nota = entrada.nextInt();
		
		switch (nota){
		case 10: case 9:
			System.out.println("Conceito � Igual: A");
			break;
		//case 9:
			//System.out.println("Conceito � Igual: A");
			//break;
		case 8: case 7:
			System.out.println("Conceito � Igual: B");
			break;
		//case 7:
			//System.out.println("Conceito � Igual: B");
			//break;
		case 6:
			System.out.println("Conceito � Igual: C");
			break;
		case 5:
			System.out.println("Conceito � Igual: C");
			break;
		case 4:
			System.out.println("Conceito � Igual: D");
			break;
		case 3:
			System.out.println("Conceito � Igual: D");
			break;
		case 2:
			System.out.println("Conceito � Igual: E");
			break;
		case 1:
			System.out.println("Conceito � Igual: E");
			break;
		case 0:
			System.out.println("Conceito � Igual: E");
			break;

		default:
			System.out.println("Nota Invalida");
			break;
		}
		entrada.close();
	}

}
