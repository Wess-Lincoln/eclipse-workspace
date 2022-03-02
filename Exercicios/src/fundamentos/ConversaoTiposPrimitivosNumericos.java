package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
public static void main(String[] args) {
	
	double a = 1;// Conversão Implicita
	System.out.println(a);
	
	//Conversão explicita (cast)
	float b = (float) 1.2345; //float pode ser convertido com após valor.
	System.out.println(b);
	
	int c = 4;//Conversão explicita (cast)
	byte d = (byte) c;
	System.out.println(d);
}
}
