package oocomposicoes;

import java.util.ArrayList;

public class Aluno {
	
	final  String nome;	
	
	ArrayList<Curso> cursos = new ArrayList<>();
	
	//Constutor
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso (Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
		

	}
	//Metodo de busca cursos
	Curso obterCursoPorNome(String nome) {
		for(Curso curso:this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	//metodo tostring converte objeto em string;
	public String toString() {
		return nome;
	}
	

}
