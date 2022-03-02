package oocomposicoes;
//Classe
public class Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;
	//Método
	int giros() {
		if(!ligado) {
			return 0;
	}else {
	
		return (int) Math.round(fatorInjecao * 3000);
		//Math.round Arredonda resultado
	}
	
	
}}
