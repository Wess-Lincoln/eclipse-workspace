package Desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome=nome;
		this.peso=peso;

}
	//m�todo
	void comer (Comida comida) {
		if(comida != null) {
			this.peso +=comida.peso;
		}
	}
	//metodo
	String Apresentar() {
		return "Ol� eu sou o " +nome+ " e eu tenho "+peso+"Kgs.";
	}
}