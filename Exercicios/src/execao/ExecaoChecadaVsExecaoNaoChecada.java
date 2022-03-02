package execao;

public class ExecaoChecadaVsExecaoNaoChecada {
		public static void main(String[] args) {
			
			
			geraErro1();
			
			try {
				geraErro2();
			} catch (Throwable e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}
			System.out.println("Fim");
		}
		//Execao não checada
		static void geraErro1() throws RuntimeException{
			throw new RuntimeException("Ocorreu um erro 01");
		}
		//Execao checada
		static void geraErro2() throws Exception{
			throw new Exception("Ocorreu erro 2");
		}
}
