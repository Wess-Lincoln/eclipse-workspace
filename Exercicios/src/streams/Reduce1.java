package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		List<Integer>numbs=Arrays.asList(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer>soma= (total,n)->total+n;
		
		Integer total = numbs.parallelStream().reduce(soma).get();
		System.out.println(total);
		
		Integer total1 = numbs.stream().reduce(100,soma);
		System.out.println(total1);
		
		numbs.stream()
		.filter(n -> n > 5)
		.reduce(soma)
	    .ifPresent(System.out::print);
	}

}
