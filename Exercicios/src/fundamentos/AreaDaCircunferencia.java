package fundamentos;

public class AreaDaCircunferencia {
	public static void main(String[] args) {
		//double= numeros reais;
		// int = numeros inteiros
		
		double raio=3.4;
		
		/*Constantes final antes da varivel-
		 * Por convers�o se atribui letras maisuculas
		 */
		final double PI=3.14159;
		
		double area= PI * raio * raio;
		
				System.out.println(area);
				raio=10;
						area=PI*raio*raio;
						//sinal de mais (+) ap�s texto junta informa��o;
						System.out.println("�rea="+area+"m2.");
	}

}
