package ooherencaDesafio;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	boolean ligado = false;
	double injeccao=1;
	double frenagem;
	double velocidadeAtual;
	int delta =5;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA=velocidadeMaxima;
		
	}
	
	
	//médoto
	int rpm() {
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(injeccao*3000);
			
		}
	}
	void acelerar() {
		if(velocidadeAtual+delta>VELOCIDADE_MAXIMA) {
			velocidadeAtual=VELOCIDADE_MAXIMA;
	}else {
		velocidadeAtual+=delta;
	}
	}
	void frear() {
		if(velocidadeAtual>=4) {
		velocidadeAtual-=4;
		}else { 
			velocidadeAtual=0;
		}
	
	}
	void ligar() {
		ligado=true;
	}
	void desligar() {
		ligado=false;
	}
	boolean estaligado() {
		return ligado;
	}
	public String toString () {
		return "Velocidade Atua é:"+velocidadeAtual+"KM/H";
	}
}
