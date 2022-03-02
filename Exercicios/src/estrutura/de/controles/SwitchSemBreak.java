package estrutura.de.controles;

import java.util.Scanner;

public class SwitchSemBreak {
	public static void main(String[] args) {
		//if(boolean)...Sentença;
		//while(boolean)...Senteça;
		//for(int=xxx;boolean;x++)...Sentença;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua Faixa:");
		
		String faixa = entrada.next();
		
		if (faixa.toLowerCase().equals("branca")) 
			System.out.println("não sei de nada");
		//if (!faixa.toLowerCase().equals("branca")) 
			//System.out.println("não sei de nada");
				
		else switch (faixa.toLowerCase()) {
		case ("preta"):
			System.out.println("Sei o Bassai-Dai..");
		case ("marron"):
			System.out.println("Sei o Teki Shodan..");
		case ("roxo"):
			System.out.println("Sei o Heian Godan..");
		case ("verde"):
			System.out.println("Sei o Heian Yodan..");
		case ("laranja"):
			System.out.println("Sei o Heian Sandan..");
		case ("vermelha"):
			System.out.println("Sei o Heian Nidan..");
		case ("amarela"):
			System.out.println("Sei o Heian Shodan..");
		
		
		entrada.close();
		
		
		}
		
}
	
		
	}


