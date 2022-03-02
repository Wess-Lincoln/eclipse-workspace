package arrays;

import java.util.Arrays;

public class Exercicios {
public static void main(String[] args) {
	//Conceito array
	double [] notasAlunoA =new double[4];
	notasAlunoA[0]= 8.5;
	notasAlunoA[1]= 8;
	notasAlunoA[2]= 6.5;
	notasAlunoA[3]= 5.5;
	
	Arrays.toString(notasAlunoA);
	System.out.println(Arrays.toString(notasAlunoA));
	
	double totaAlunoA=0;
	//laço for cria indice i e percorre o array
	//for
	//(i inicia em 0, i menor 3 sai do laço e i++ percorre 1 a mais na array);
	//for(int i=0; i<3; i++) {
	for(int i =0; i<notasAlunoA.length; i++) {
		totaAlunoA += notasAlunoA[i];
	}
	System.out.println(totaAlunoA/notasAlunoA.length);// notação ponto length 
	//contabiliza o numero da array
	
	//Outra forma de Array
	double notaArmazenada =7.1;
	double[] notasAlunoB = {6.9, 8.5, notaArmazenada, 10}; 
	double totalAlunoB =0;
	for (int i = 0; i < notasAlunoB.length; i++) {
		totalAlunoB += notasAlunoB[i];	
	}
	System.out.println(totalAlunoB/notasAlunoB.length);
}
}
