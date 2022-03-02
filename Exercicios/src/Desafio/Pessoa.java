package Desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome=nome;
		this.peso=peso;

}
	//método
	void comer (Comida comida) {
		if(comida != null) {
			this.peso +=comida.peso;
		}
	}
	//metodo
	String Apresentar() {
		return "Olá eu sou o " +nome+ " e eu tenho "+peso+"Kgs.";
	}
}