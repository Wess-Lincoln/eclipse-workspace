package fundamentos;

public class Wrapper {
public static void main(String[] args) {
	//byte
	Byte b =100;//byte = Tipo Primitivo
	Short s = 10000;//short = Tipo Primitivo
	
	
	Integer i =1000000;//int = Tipo Primitivo
	Long l = 1000000L;//long = Tipo Primitivo
	
	System.out.println(b.byteValue());
	System.out.println(s.toString());
	System.out.println(i*3);
	System.out.println(l/3);
	
	Float f= 123.10F;// float = Tipo Primitivo
	System.out.println(f);
	
	Double d=12345.678; // double  = Tipo Primitivo
    System.out.println(d);
	
	Boolean bo = Boolean.parseBoolean("true");//boolean = Tipo Primitivo
	System.out.println(bo.toString().toUpperCase());
	
	Character c = '#'; //Char = Tipo Primitivo;
	System.out.println(c.toString());
	

	
}

}
