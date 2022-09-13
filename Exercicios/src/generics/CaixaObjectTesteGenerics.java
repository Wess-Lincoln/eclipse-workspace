package generics;

public class CaixaObjectTesteGenerics {
public static void main(String[] args) {
	
	Caixa<String>caixaA = new Caixa<>();
	caixaA.guardar("Segredo");
	
	System.out.println(caixaA.abrir());
	
	Caixa<Double>caixaB = new Caixa<>();
	caixaB.guardar(5.2);
	
	System.out.println(caixaB.abrir());
}
}
