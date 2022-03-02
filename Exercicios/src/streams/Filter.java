package streams;


import java.util.Arrays;
import java.util.List;

public class Filter {
			public static void main(String[] args) {
				
				Aluno a1=new Aluno("Ana", 7.5);
				Aluno a2=new Aluno("bia", 8);
				Aluno a3=new Aluno("lia", 7);
				Aluno a4=new Aluno("bruna", 6);
				Aluno a5=new Aluno("dani", 10);
				Aluno a6=new Aluno("Giovana", 5);
				
			List<Aluno>alunos=Arrays.asList(a1,a2,a3,a4,a5,a6);	
			
			alunos.stream()
			.filter(a->a.nota>=7)
			.map(a->"Parab�ns "+ a.nome + "! Voc� foi Aprovado(a)!")
			.forEach(System.out::println);
			
			}
}
