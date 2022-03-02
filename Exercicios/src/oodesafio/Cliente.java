package oodesafio;

import java.util.ArrayList;

public class Cliente {
	
	String nomeCliente;
//Cliente recebe compra lista
	ArrayList<Compra>compras= new ArrayList<>();
	Cliente (String nomeCliente){
		this.nomeCliente=nomeCliente;
	}
	
	
	double obterValorTotal() {
		double total=0;
		for (Compra compra : compras) {
			total+= compra.obterValorTotal();
		}
		
		
		return total;
				
	
	}
	
	

		
	}


