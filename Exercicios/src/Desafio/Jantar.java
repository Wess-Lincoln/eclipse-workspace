package Desafio;

public class Jantar {
	public static void main(String[] args) {
		
		//Construtores;
		
		//Estanciar construtor em Classe Comida
		Comida c1 = new Comida("Arroz",0.223);
		Comida c2 = new Comida("Feijão",0.300);
		
		//Estancia Construtor em Classe Pessoa
		Pessoa p1 = new Pessoa("Camila",56.00);
		Pessoa p2 = new Pessoa("Sarah",54.00);
		
		System.out.println(p1.Apresentar());
		System.out.println(p2.Apresentar());
		
		//Estaciar Metodo comer em pessoa.
		p1.comer(c1);
		p2.comer(c1);
		
		System.out.println(p1.Apresentar());
		System.out.println(p2.Apresentar());
		
	}

}
