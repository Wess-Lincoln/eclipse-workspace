package execao;

public class Basico {
		public static void main(String[] args) {
			
			Aluno a1= null;
			
			try {
				imprimirNomeDoAluno(a1);
			} catch (Exception e) {
				System.out.println("Ocorreu um erro ao Imprimir nome do Aluno");
				// TODO: handle exception
			}
			try {
				System.out.println(7/0);
			} catch (ArithmeticException e) { 
				System.out.println("Ocorreu um erro"+e.getMessage());
				// TODO: handle exception
			}
			
			System.out.println("FIM!!");
		}
			public static void imprimirNomeDoAluno(Aluno aluno) {
				 System.out.println(aluno.nome);
			}
		}


