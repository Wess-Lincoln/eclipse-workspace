package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
public static void main(String[] args) {
	
	double a = 1;// Convers�o Implicita
	System.out.println(a);
	
	//Convers�o explicita (cast)
	float b = (float) 1.2345; //float pode ser convertido com ap�s valor.
	System.out.println(b);
	
	int c = 4;//Convers�o explicita (cast)
	byte d = (byte) c;
	System.out.println(d);
}
}
