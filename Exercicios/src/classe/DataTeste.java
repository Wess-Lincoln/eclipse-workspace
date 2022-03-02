package classe;

import java.util.Scanner;

public class DataTeste {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		Data d1 = new Data(0, 0, 0);
		System.out.println("Digite dia:");
		
		d1.dia = input.nextInt();
		while(d1.dia >31);
		System.out.println("Digite um Mês:");
		d1.mes = input.nextInt();
		while(d1.mes >12);
		System.out.println("Digite um ano:");
	    d1.ano = input.nextInt();
	    
	    
	    System.out.println
	    (d1.dataExt());
	    
	    input.close();
		
		//d1.dia ="Segunda-Feira";
		//d1.mes = "Janeiro";
		//d1.ano =1990;
				
	}

}
