package classe;



public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto=(0.29);
		
		System.out.printf(p1.nome+" "+"\nR$%.2f.",p1.precoComDesconto());
		
		System.out.printf(p2.nome+" "+"\nR$%.2f.",p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("\nMédia do Carrinho = R$%.2f.",mediaCarrinho);
		
		
		
	}
}
