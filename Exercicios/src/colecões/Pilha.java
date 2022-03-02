package colecões;

import java.util.ArrayDeque;
import java.util.Deque;
// Conceito LIFO -> Last in -Last Out
public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Principe");
		livros.push("Dom Quixote");
		livros.push("The Hobbit");
		
		System.out.println(livros.peek());
	}
}
