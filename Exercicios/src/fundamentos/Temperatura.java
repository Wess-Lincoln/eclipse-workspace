package fundamentos;

public class Temperatura {
public static void main(String[] args) {
	//(ºF-32) x 5/9=Cº)
	
	
	double fahrenheit = 86;
	final int VALORFIXO1 =32;
	/* Resultados abaixo de 1 
	zeram colocar .0 para interpretador entender como numero real;
	*/
	final double VALORFIXO2 = 5/9.0;
	
	double celsius = ((fahrenheit-VALORFIXO1)*VALORFIXO2);
	System.out.println("Temperatura="+celsius+"º.");
	
	fahrenheit =150;
	celsius = ((fahrenheit-VALORFIXO1)*VALORFIXO2);	
	System.out.println("Temperatura="+celsius+"º.");
	
	
}
}
