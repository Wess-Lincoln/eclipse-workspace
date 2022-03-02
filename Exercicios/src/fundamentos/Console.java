package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("dia!!");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Mega Senna %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6 );
		
		System.out.printf("Salario: %.2f %n",1234.5678);
		System.out.printf("Nome: %s %n", "Wess");
		
		Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite Seu Nome:");
		String nome = entrada.nextLine();
		
		
	    System.out.print("Digite Seu Sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite Sua Idade:");
		int idade = entrada.nextInt();
		
		
		
		//System.out.printf("\n \nNome="+nome+"\nSobrenome="+sobrenome+"\nIdade="+idade);
		System.out.printf("%s %s tem %d Anos.%n", 
		nome, sobrenome, idade);
		
		entrada.close(); //Scanner precisa ser fechado
	}
	

}
