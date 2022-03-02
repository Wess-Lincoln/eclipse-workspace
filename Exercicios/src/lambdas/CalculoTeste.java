package lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		
		//Fun��es Lambdas
		Calculo calculo=(x,y)->{
			return x + y;
		};
		System.out.println(calculo.executar(2,3));
		
		calculo=(z,w)->z * w;
		
		System.out.println(calculo.executar(2,3));
	}

}
