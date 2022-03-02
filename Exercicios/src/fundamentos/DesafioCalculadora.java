package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		String num1= JOptionPane.showInputDialog
				("Digite o Primeiro Numero");
		
		String operadorcalculo= JOptionPane.showInputDialog
				("Digite o Operador de Calculo");
		
		String num2= JOptionPane.showInputDialog
				("Digite o Segundo Numero");
		
		
		double valor1 =Double.parseDouble(num1);
		double valor2 =Double.parseDouble(num2);
		
		
		double resultado= "+".equals(operadorcalculo) ? valor1+valor2 : 0;
		resultado = "-".equals(operadorcalculo) ? valor1-valor2 : resultado;
		resultado = "*".equals(operadorcalculo) ? valor1*valor2 : resultado;
		resultado = "/".equals(operadorcalculo) ? valor1/valor2 : resultado;
		resultado = "%".equals(operadorcalculo) ? valor1%valor2 : resultado;
		
		JOptionPane.showMessageDialog(null,"O Resultado é :"+resultado);
		
		
		//System.out.println(resultado);
		
		
	}

}
