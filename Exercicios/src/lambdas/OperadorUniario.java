package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUniario {
		public static void main(String[] args) {
			
			
			UnaryOperator<Integer> maisDois=n->n+2;
			
			UnaryOperator<Integer> vezesDois=n->n*2;
			
			UnaryOperator<Integer> aoQuadrado=n->n*n;
			
		System.out.println(maisDois.apply(4));
		System.out.println(vezesDois.apply(4));
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(4);
		System.out.println(resultado1);
		
			
		}
}
