package oocomposicoes;

public class CompraTeste {
	
	public static void main(String[] args) {
		Compra compra1=new Compra();
		compra1.nomeCliente= "Sarah";
		compra1.itens.add(new Item("Caneta",20, 7.45));
		compra1.itens.add(new Item("Borracha",10, 0.45));
		compra1.itens.add(new Item("Caderno",3, 12.45));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
	}

}
