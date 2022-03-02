package fundamentos;

public class Inferencia {
public static void main(String[] args) {
	//inferencia, interpreta o valor e atribui o resultado;
	
	double a = 4.5;//variavel declarada e inicializada;
	System.out.println(a);
	
	var b =4.5;
	System.out.println(b);
	
	var c ="Texto";
	System.out.println(c);
	
	c= "outro texo";
	System.out.println(c);

	double d;//variavel declarada;
	d=123.65;// Variavel Inicializada
	System.out.println(d);
	
	//var não consegue inicializar sem a declaração de valor;
	/*var e;
	e="texto var";
	System.out.println(e);*/
	
	/*var f =12;
	f=12.01;
	System.out.println(f);*/
	
}

}
