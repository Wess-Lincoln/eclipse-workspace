package oopolimofismo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa convidada=new Pessoa(99.65);
		
		Arroz ingrediente1=new Arroz(0.2);
		Feijao ingrediente2=new Feijao(0.1);
		Sorvete sobremessa=new Sorvete(0.4);
		
		convidada.comer(ingrediente1);
		convidada.comer(ingrediente2);
		
		System.out.println(convidada.getPeso());
		convidada.comer(sobremessa);
		System.out.println(convidada.getPeso());
	}

}
