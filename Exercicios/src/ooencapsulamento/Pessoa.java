package ooencapsulamento;

public class Pessoa {
	private String nome;
	private  int idade;
	// construtor
	public Pessoa(String nome, int idade) {
	   setNome(nome);
	   setIdade(idade);
	}
	// metodo
	//Getter
	public int getIdade() {
		
		return idade;
	}
	//Metodo
	//Setter
	public void  setIdade(int novaIdade) {
		novaIdade=Math.abs(novaIdade);
		if(novaIdade>=0 && novaIdade>120) {
		this.idade=novaIdade;
	}
		
}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Ol� meu nome �: "+getNome()+" e tenho:"+getIdade();
	
	}
}