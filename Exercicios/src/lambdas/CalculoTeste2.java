package lambdas;

import java.util.function.BinaryOperator;

 
public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double>calculo=(x,y)->{return x + y;
		};
		System.out.println(calculo.apply(2.0,3.0));
		
		calculo=(z,w)->z * w;
		
		System.out.println(calculo.apply(2.0,3.0));
	}
	

}
