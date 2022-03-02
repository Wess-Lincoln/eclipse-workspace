package oocomposicoes;

public class CursosTeste {
 public static void main(String[] args) {
	Aluno aluno1 = new Aluno("Camila");
	Aluno aluno2 = new Aluno("Sarah");
	Aluno aluno3 = new Aluno("Michele");
	
	
	Curso curso1 =new Curso("Java Completo");
	Curso curso2 =new Curso("Python");
	Curso curso3 =new Curso("Java Script");
	
	curso1.adicionarAluno(aluno1);
	curso1.adicionarAluno(aluno2);
	
	curso2.adicionarAluno(aluno1);
	curso2.adicionarAluno(aluno3);
	
	aluno1.adicionarCurso(curso3);
	aluno2.adicionarCurso(curso3);
	aluno3.adicionarCurso(curso3);
	
	for(Aluno aluno:curso1.alunos) {
		System.out.println("Estou Matriculado no Curso 1...");
		System.out.println("...e meu nome é.."+ aluno.nome);
		System.out.println();
		
		System.out.println("Estou Matriculado no Curso..."+curso2.nome);
		System.out.println("...e meu nome é.."+ aluno.nome);
		System.out.println();
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursosEncontrados= aluno1.obterCursoPorNome("Java Completo");
		if(cursosEncontrados != null) {
			
		
		    System.out.println(cursosEncontrados.nome);
			System.out.println(cursosEncontrados.alunos);
		
		}
	}
}
}
