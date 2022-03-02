package ooherenca;

public class Jogo {
	public static void main(String[] args) {
		
		Ryu j1 = new Ryu();
		j1.x=10;
		j1.y=10;
		Ken j2 = new Ken();
		j2.x=10;
		j2.y=11;
			
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		
		j1.atacar(j2);
		
		System.out.println("Ryu tem ==>"+j1.vida);
		System.out.println("Ken tem ==>"+j2.vida);
	}
}
