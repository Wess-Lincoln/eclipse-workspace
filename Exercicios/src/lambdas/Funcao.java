package lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		
		Function<Integer,String>parOuImpar =
				numero->numero % 2==0 ? "Par": "Impar";
	
	System.out.println(parOuImpar.apply(33));
	
	Function<String,String>oResultadoE=
			valor -> "O Resultado �:"+valor;
			
	Function<String,String>empolgado=
			valor ->valor+"!!!!";
			
	Function<String,String>duvida=
			valor ->valor+"???";
	
	String resultadoFinal1 =parOuImpar
			.andThen(oResultadoE)
			.andThen(empolgado)
			.apply(32);
	System.out.println(resultadoFinal1);
	
	String resultadoFinal2=parOuImpar
			.andThen(oResultadoE)
			.andThen(duvida)
			.apply(33);
	System.out.println(resultadoFinal2);
	
	
			
		
	}

}
