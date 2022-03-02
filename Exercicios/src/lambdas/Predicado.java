package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produto>isCaro=
				Prod ->(Prod.preco*(1-Prod.desconto))>=750;
				
	Produto produto =new Produto("Notebook",3899.89,0.15);
	System.out.println(isCaro.test(produto));
				
	}
}
