package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
public static void main(String[] args) {
	
	
	Scanner entrada= new Scanner(System.in);
	System.out.println("Digite a Quantidade de Notas á Lançar:");
	int qntNotas=entrada.nextInt();
	
	double[]qNotas= new double[qntNotas];
	
	for (int i = 0; i < qNotas.length; i++) {
		System.out.println("Informe a nota"+(i+1)+": ");
		qNotas[i]= entrada.nextDouble();
	}
		System.out.println(Arrays.toString(qNotas));
		
	double totalNotas=0;	
	for (double notas : qNotas) {
		totalNotas+=notas;
	
	
	}
	double media = totalNotas/qNotas.length;
	System.out.println("A média das notas é:"+media);
	entrada.close();	
	}
		
	
}

