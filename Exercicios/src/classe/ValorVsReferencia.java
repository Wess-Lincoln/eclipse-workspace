package classe;

public class ValorVsReferencia {
public static void main(String[] args) {
	double a=2;
	double b=a; //atribui��o por valor Primitivo.
	
	a++;
	b--;
	
	System.out.println(a);
	System.out.println(b);
	
	Data d1 = new Data(1, 6, 2022);
	Data d2 = d1; //Atribui��o por OBJETO;
	
	d1.dia=31;
	d2.mes=12;
	
	System.out.println(d1.dataExt());
	System.out.println(d2.dataExt());
	
	voltarDataValorPadrao(d1);
	
	System.out.println(d1.dataExt());
    
	int c= 5;
	alterarPrimitivo(c);
	System.out.println(c);
		
}
static void voltarDataValorPadrao (Data d) {
	d.dia=1;
	d.mes=1;
	d.ano=1970;
}
static void alterarPrimitivo(int c) {
	c++;
}
}