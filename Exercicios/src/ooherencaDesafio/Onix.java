package ooherencaDesafio;

public class Onix extends Carro implements Esportivo{
	Onix(){
		super(215);
	}
	@Override
	void acelerar() {
		// TODO Auto-generated method stub
		velocidadeAtual+=15;
	
	}
	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		
	}

}
