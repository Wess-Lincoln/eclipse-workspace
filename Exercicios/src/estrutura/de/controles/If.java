package estrutura.de.controles;
import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a M�dia:");
		
		double media  = entrada.nextDouble();
		
		if(media<=10 && media>=7) {
			System.out.println("Aprovado");
		    System.out.println("Parab�ns");
		}
		
		
		if(media<7 && media >=5) {
		    System.out.println("Recupera��o");
		}
		
		if(media <5) {
			System.out.println("Reprovado");
		}
		
		
		entrada.close();
		
		
		
	}

}
