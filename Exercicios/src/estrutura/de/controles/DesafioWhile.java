package estrutura.de.controles;

import java.util.Scanner;


public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner teclado  = new Scanner(System.in);
		
		
		int quantidade=0;
		double nota = 0;
		double total=0;
		
		while (nota != -1) {
			System.out.println("Informe uma nota ou -1 para sair");
			nota = teclado.nextDouble();
			
			if(nota<=10 && nota>=0) {
		    total +=nota;
		    quantidade++;
		    
			} else if (nota !=-1){
		   System.out.println("Nota Invalida!");
			}
		}
		    
		double media=total/quantidade;
		System.out.print("M�dia:"+media);

				
		teclado.close();
		
		}	
		
	}
		


	


