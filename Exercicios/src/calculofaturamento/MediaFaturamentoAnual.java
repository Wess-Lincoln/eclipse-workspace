package calculofaturamento;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MediaFaturamentoAnual {
	private static final int dFaturamento = 0;
	public static void main(String[] args) {
		
	Scanner dia= new Scanner(System.in);
	System.out.println("Digite o dia mês e ano a lançar:");
	String data=dia.next().replace(".", "/");
	Scanner valorFaturamento= new Scanner(System.in);
	System.out.println("Digite o valor de Faturamento:");
	double diaFaturamento=valorFaturamento.nextDouble();
	}
	public void setData(String data1) {
		this.setData(data1);
		SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	
	}
	Double[]diaFaturamento= new Double[dFaturamento];{
	for (double i = 0; i < diaFaturamento.length; i++) {
		System.out.println("Informe a nota"+(i+1)+": ");
		diaFaturamento[(int) i]= (double) diaFaturamento.length;
	}
		System.out.println(Arrays.toString(diaFaturamento));
		
	double totalFaturamento=0;	
	for (double faturamento : diaFaturamento) {
		totalFaturamento+=faturamento;
	
	
	}
	double media = totalFaturamento/diaFaturamento.length;
	System.out.println("A média das notas é:"+media);
	
	}
	
}	

	

