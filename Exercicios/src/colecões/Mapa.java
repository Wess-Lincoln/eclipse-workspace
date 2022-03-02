package colecões;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios= new HashMap<>();
		usuarios.put(1, "Camila");	
		usuarios.put(2, "Sarah");	
		usuarios.put(3, "Fernanda");	
		usuarios.put(4, "Maira");	
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Sarah"));
		System.out.println(usuarios.get(3));
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
			
			
		}
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		for (Entry<Integer, String> registro:usuarios.entrySet()){
			System.out.print(registro.getKey()+"==>");
			System.out.println(registro.getValue());
	}
	
	
}}
