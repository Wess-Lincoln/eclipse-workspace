package colecões;

import java.util.HashSet;



public class Hash {
	public static void main(String[] args) {
		
		HashSet<Users>usuarios=new HashSet<>();
		usuarios.add(new Users("Camila"));
		usuarios.add(new Users("Sarah"));
		usuarios.add(new Users("Fernanda"));
		usuarios.add(new Users("Andressa"));
		usuarios.add(new Users("Maira"));
		
		System.out.println(usuarios.contains(new Users("Sarah")));
	}
}
