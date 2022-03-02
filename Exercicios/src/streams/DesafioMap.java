package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;



public class DesafioMap {
	public static void main(String[] args) {
	
		
		List<Integer> numbs =Arrays.asList(1,2,3,4,5,6,7,8,9);
	    
	    
	    UnaryOperator<String> revertNumbs=s -> 
	    new StringBuilder(s).reverse().toString();
	    
	    Function<String, Integer>binaryInvert=s-> Integer.parseInt(s,2);
	    
	    numbs.stream()
	        .map(Integer::toBinaryString)
	        .map(revertNumbs)
	        .map(binaryInvert)
	    	.forEach(System.out::print);
	    
	    
	    
	    
	    
	   
	    
		
	   

	  
		
		
	
	    
	}

}
