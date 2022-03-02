package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print=System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Lua ","Node\n ");
		langs.forEach(print);
		
		String[] moreLangs = {"Pyton ", "Java Script ", "Go\n"};
		Stream.of(moreLangs).forEach(print);
		Arrays.stream(moreLangs).forEach(print);
		Arrays.stream(moreLangs, 1, 2).forEach(print);
		
		List<String>otherLangs = Arrays.asList("C ", "C# ", "Delphi\n");
		otherLangs.stream().forEach(print);
	}

}
