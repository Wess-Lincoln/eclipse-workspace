package classe;

public class Data {
	int dia;//Variaveis de Instancia ou classe;
	int mes;
	int ano;
	
Data() {//sem parametros
	//dia =1;
	//mes =1;
	//ano = 1970;
	this(01, 01, 1070);
}
	// com paramentros
Data (int dia, int mes, int ano) { //Construtor
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;	
}

String dataExt (){
	String formato=("%d/%d/%d");
	return String.format(formato, dia ,mes, ano);
}
}