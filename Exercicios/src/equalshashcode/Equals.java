package equalshashcode;

public class Equals {
 public static void main(String[] args) {
	Usuario u1 = new Usuario();
	u1.nome= "Sarah Silva";
	u1.email="sarah@gmail.com";
	
	Usuario u2 = new Usuario();
	u2.nome= "Sarah Silva";
	u2.email="sarah@gmail.com";
	
	System.out.println(u1==u2);
	System.out.println(u2.equals(u1));
	
}
}
