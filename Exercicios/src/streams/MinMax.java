package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		
		Aluno a1=new Aluno("Ana", 7.5);
		Aluno a2=new Aluno("bia", 8);
		Aluno a3=new Aluno("lia", 7);
		Aluno a4=new Aluno("bruna", 6);
		Aluno a5=new Aluno("dani", 10);
		Aluno a6=new Aluno("Giovana", 5);
		
		List<Aluno>alunos=Arrays.asList(a1,a2,a3,a4,a5,a6);	
		
		Comparator<Aluno>melhorNota=(aluno1,aluno2)->{
			if(aluno1.nota>aluno2.nota) return 1;
					if(aluno1.nota<aluno2.nota) return -1;
							return 0;
					
		};
		Comparator<Aluno>piorNota=(aluno1,aluno2)->{
			if(aluno1.nota>aluno2.nota) return -1;
			if(aluno1.nota<aluno2.nota) return 1;
			return 0;
			
		};
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
	}
	

}
