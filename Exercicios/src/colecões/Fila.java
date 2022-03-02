package colecões;

import java.util.LinkedList;
import java.util.Queue;
// Conceito FIFO -> First in - First Out
public class Fila {
	public static void main(String[] args) {
		Queue<String> fila= new LinkedList<String>();
		fila.add("Ana");//.add quando fila cheio retona erro!!
		fila.offer("Bia");//.offer quando fila cheio retona false!!
		fila.offer("Carlos");
		fila.offer("Manu");
		fila.offer("Sarah");
		fila.offer("Camila");
		
		//Quando Fila vazia.
		System.out.println(fila.peek());//Retorna False
		System.out.println(fila.element());//Retorna Erro!
		System.out.println(fila.poll());//Retorna null
		System.out.println(fila.remove());//Retorna erro!
		//.pool retorna o valor e o exclui.
	}
}
