package colecões;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class ConjuntoOrganizado {
	public static void main(String[] args) {
		SortedSet<String>listaAprovados =new TreeSet<>();
		//Set<String> listaAprovados =new HashSet<String>();
		listaAprovados.add("Sarah");
		listaAprovados.add("Camila");
		listaAprovados.add("Ana");
		listaAprovados.add("Elen");
		
		for (String candidatos : listaAprovados) {
			System.out.println(candidatos);
		}
		
	}
}
