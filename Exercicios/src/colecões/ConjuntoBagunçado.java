package colecões;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
	
	HashSet conjunto = new HashSet();
	conjunto.add(true);// HashSet não aceita primitivo.
	//Converte para tipos Wrapper Integer, Boolean,Double e etec..
	conjunto.add(1.5);
	conjunto.add("Teste");
	conjunto.add(1);
	conjunto.add('x');
	
	// .SIZE refere-se ao tamanho do conjunto.
	System.out.println("Tamanho do Conjunto é:"+conjunto.size());
	
	System.out.println("Remova do Conjunto:"+conjunto.remove('x'));
	
	System.out.println("Que contenha:"+conjunto.contains(1));
	
	Set nums = new HashSet();
	nums.add(1);
	nums.add(2);
	nums.add(3);
	
	
	System.out.println(nums);
	System.out.println(conjunto);
	
	// .addAll() adiciona um conjunto a outro
	conjunto.retainAll(nums);
	//conjunto.addAll(nums);
	System.out.println(conjunto);
	conjunto.clear();
	System.out.println(conjunto);
	
	
	
}
}