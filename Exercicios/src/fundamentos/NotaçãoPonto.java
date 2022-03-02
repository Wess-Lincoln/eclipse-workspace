package fundamentos;

public class NotaçãoPonto {
	public static void main(String[] args) {
		
		String s ="Bom dia X";
		s = s.replace("X", "senhor");//Substitui palavras
		s = s.toUpperCase(); //Converte String em maiusuculo
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x= "WESS".toLowerCase();
		System.out.println(x);
		
		String y= "Bom dia X".replace("X", "Wess");
		System.out.println(y);
		
		//Variaveis Tipos Primitivos não tem operador ".";
	}

}
