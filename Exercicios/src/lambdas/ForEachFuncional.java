package lambdas;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ForEachFuncional {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		java.util.List<String> aprovados= Arrays.asList
				("Ana","Bia","Lia","Gui");
		
		System.out.println("Forma Tradicional...");
		
		for(String nome:aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01...");
		
		((Iterable<String>) aprovados).forEach((nome) ->{System.out.println(nome+"!!!");});
	}

}
