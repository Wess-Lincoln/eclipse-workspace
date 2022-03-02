package oodesafio;

public class ClienteTeste {
   public static void main(String[] args) {
	
	   
	   Compra compra1 = new Compra();
	   compra1.adicionarItem("lapis",0.80,5);
	   compra1.adicionarItem("Notebook",1.520,1);
	   
	   Compra compra2 = new Compra();
	   compra2.adicionarItem("caneta",1.80,5);
	   compra2.adicionarItem("Caderno",12.90,3);
	   
	   Cliente cliente = new Cliente("Sarah Camila");
	   cliente.compras.add(compra1);
	   cliente.compras.add(compra2);
	   
	   System.out.println(cliente.obterValorTotal());
	
}
}
