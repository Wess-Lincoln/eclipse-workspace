package oodesafio;

import java.util.ArrayList;

public class Compra {
//Compra recebe item
	ArrayList<Item>itens=new ArrayList<>();
	//m�todo
	void adicionarItem(Produto p,int qtde) {
		this.itens.add(new Item(p, qtde));
	}
		void adicionarItem(String nome ,double preco,int qtde) {
			var produto=new Produto(nome, preco);
				this.itens.add(new Item(produto, qtde));
	}
	double obterValorTotal() {
		double total=0;
		for(Item item:itens) {
			total+= item.produto.preco*item.qtde;
		}
		return total;
	}
}
