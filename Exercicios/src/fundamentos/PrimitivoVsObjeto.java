package fundamentos;

public class PrimitivoVsObjeto {
public static void main(String[] args) {
	//Objetos é aquilo gerado por uma string e a notação ponto
	//é as funções do objeto
	String s = new  String ("texto");
	s.toUpperCase();
	
	
	//Wrapper é a notação ponto
	//é as funções do objeto primitivo
	int a = 123;
	System.out.println(a);
	
}
}
