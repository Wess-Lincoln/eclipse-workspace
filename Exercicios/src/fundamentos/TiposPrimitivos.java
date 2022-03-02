package fundamentos;

public class TiposPrimitivos {
public static void main(String[] args) {
	//informações de um funcionario;
	
	// Tipos numericos Inteiros;
	
	byte anosDeEmpresa=23;
	short numeroDeVoos=542;
	int id= 56789;
	long pontosAcumulados = 3_234_845_223L;/*Variaveis tipo long 
	se atribui o L no final*/
	
	//Tipos numéricos reais
	
	float salario =11_445.44F;/*Variaveis tipo float 
	se atribui o F no final*/
	double vendasAcumuladas = 2_991_797_103.01;
	
	//tipo booleano
	
	boolean estaDeFerias= true;//ou false apenas;
	
	//Tipo caractere;
	
	char status = 'A'; //ativo;
	
	//Dias de empresa.
	
	System.out.println("Dias trabalhados="+anosDeEmpresa*365);
	
	//Numeros de Viagens;
	
	System.out.println("Numero de viagens="+numeroDeVoos/2);
	
	//Pontos por Real
	
	System.out.println("Pontos por Real="+pontosAcumulados/vendasAcumuladas);
	
	System.out.println("ID:"+id+" Recebe->R$ "+salario);
	
	System.out.println("Está de Férias? "+estaDeFerias);
	
	System.out.println("Status="+status);
}

}
