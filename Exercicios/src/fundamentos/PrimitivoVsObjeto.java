package fundamentos;

public class PrimitivoVsObjeto {
public static void main(String[] args) {
	//Objetos � aquilo gerado por uma string e a nota��o ponto
	//� as fun��es do objeto
	String s = new  String ("texto");
	s.toUpperCase();
	
	
	//Wrapper � a nota��o ponto
	//� as fun��es do objeto primitivo
	int a = 123;
	System.out.println(a);
	
}
}
