package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe a quantidade de alunos:");
	int qntAlunos = entrada.nextInt();
	
	System.out.println("Informe a quantidade de notas por aluno:");
	int notasPorAluno = entrada.nextInt();
	
	double [][] notasDaTurma= new double[qntAlunos][notasPorAluno];
	
	double total=0;
	for (int a = 0; a < notasDaTurma.length; a++) {
		for (int n = 0; n < notasDaTurma[a].length; n++) {
			System.out.printf("Informe a nota %d do aluno %d:", n+1,a+1);
			
			notasDaTurma[a][n]= entrada.nextDouble();
			total+=notasDaTurma[a][n];
				
		}
		
	}
	double media =total /(qntAlunos*notasPorAluno);
	System.out.println("A m�dia total �:"+media);
	
	for (double[] notasDosAlunos : notasDaTurma) {
		System.out.println(Arrays.toString(notasDosAlunos));
		
	}
	
	entrada.close();
	
}
}
