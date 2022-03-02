package fundamentos;

import java.util.Scanner;

public class NextInNextDouble {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("\nQual a sua idade?");
		int idade = teclado.nextInt();
		
		System.out.println("\nQual o seu nome?");
		String nome = teclado.nextLine();
		
		System.out.println("\nQual o seu sobrenome?");
		String sobrenome = teclado.nextLine();
		 
		teclado.close();
	}

}
