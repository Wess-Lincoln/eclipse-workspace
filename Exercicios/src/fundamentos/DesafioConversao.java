package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		Locale.setDefault(new Locale("en","US"));
		
		System.out.println("Digite Primeiro Salario:R$");
		String sal1 = teclado.next().replace(",",".");
	    
		System.out.println("Digite Segundo Salario:R$");
		String sal2 = teclado.next().replace(",",".");
		
		System.out.println("Digite Terceiro Salario:R$");
		String sal3 = teclado.next().replace(",",".");
		
		double salario1= Double.parseDouble(sal1);
		double salario2= Double.parseDouble(sal2);
		double salario3= Double.parseDouble(sal3);
		
		Double somaSalarios = (salario1+salario2+salario3);
	    
		
		System.out.println("A soma dos 3 Salarios é:R$"+somaSalarios);
		
		System.out.println("O Valor Médio dos Salarios é:R$"+somaSalarios/3);
		
		teclado.close();
		
	}

	
}
