package oocomposicoes;

public class Carro {
// contrutor
	Motor motor=new Motor();
	
	// metodo void não precisa de return
	void acelerar() {
		motor.fatorInjecao +=4;
	}
	
	void frear( ) {
		motor.fatorInjecao -=4;
	}
	void ligar() {
		motor.ligado=true;
	}
	void desligar() {
		motor.ligado=false;
		
	}
	boolean estaligado() {
		return motor.ligado;
	}
}
