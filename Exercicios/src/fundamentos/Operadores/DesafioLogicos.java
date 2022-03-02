package fundamentos.Operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//trabalho na terça (V or F)
	
		//trabalho na quinta (V or F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = (trabalho1 && trabalho2);
		boolean comprouTV32 = (trabalho1 ^ trabalho2);
		boolean tomouSorvete = (trabalho1 || trabalho2);
		
		boolean maisSaudavel = !tomouSorvete;
		
		System.out.println("Comprou TV 50? "+comprouTV50);
		System.out.println("Comprou TV 32? "+comprouTV32);
		System.out.println("Comprou TV 32\"Sorvete? "+tomouSorvete);
		System.out.println("Esta mais Saudavel?"+maisSaudavel);
		
				
		
	}

}
