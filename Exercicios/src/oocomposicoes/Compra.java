package oocomposicoes;

import java.util.ArrayList;

public class Compra {
    String nomeCliente;
	ArrayList<Item>itens=new ArrayList<Item>();
	//Metodo soma itens.
	
	double getValorTotal() {
		double total = 0; 	
		
		for (Item item : itens) {
			total += item.quantidade*item.preco;
			
		}
		
		return total;
	}
}
