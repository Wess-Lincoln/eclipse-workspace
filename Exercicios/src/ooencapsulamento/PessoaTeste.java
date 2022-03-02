package ooencapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
	Pessoa p1= new Pessoa("Sarah",24);
	p1.setIdade(24);
	
	System.out.println("Idade:"+p1.getIdade());
	System.out.println(p1);
	
	
	}	 
}
