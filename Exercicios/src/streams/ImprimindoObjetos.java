package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		
		List<String> aprovados=Arrays.asList("Bia","Lia","Jeh","Ana");
			
		System.out.println("Usando ForEach");
			for (String nome : aprovados) {
				System.out.println(nome);
				
			}
		System.out.println("/nUsando interator..");
		Iterator<String>list=aprovados.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println("Utilizando For comum");
			for (int i = 0; i < aprovados.size(); i++) {
				System.out.println(aprovados.get(i));
				
			}
	    Stream<String>stream=aprovados.stream();
	    stream.forEach(System.out::println);
	}
}
