package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
		public static void main(String[] args) {
			
			Aluno a1=new Aluno("Ana", 7.5);
			Aluno a2=new Aluno("bia", 8);
			Aluno a3=new Aluno("lia", 7);
			Aluno a4=new Aluno("bruna", 6);
			Aluno a5=new Aluno("dani", 10);
			Aluno a6=new Aluno("Giovana", 5);
			Aluno a7=new Aluno("Ana", 7.5);
			Aluno a8=new Aluno("bia", 8);
			Aluno a9=new Aluno("lia", 7);
			Aluno a10=new Aluno("bruna", 6);
			Aluno a11=new Aluno("daniela", 10);
			Aluno a12=new Aluno("Giovana", 5);
			
			List<Aluno>alunos=Arrays.asList
					(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12);
			
	System.out.println("Distinct busca duplicados");
			alunos.stream().distinct().forEach(System.out::println);
			
   System.out.println("\nSkip/Limit");
   alunos.stream().distinct()
   		.skip(2)
   		.limit(2)
   		.forEach(System.out::println);
   
   System.out.println("\nTakeWhile");
   alunos.stream().distinct()
   		.takeWhile(a->a.nota>=7)
   		.forEach(System.out::println);
	
			
		}
}
