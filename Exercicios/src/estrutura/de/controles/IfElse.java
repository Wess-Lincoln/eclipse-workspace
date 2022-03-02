package estrutura.de.controles;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog
				("Informe um numero:");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Numero é par!");
		}
			else {
			JOptionPane.showMessageDialog(null, "Numero é Impar!");
		}
		
	}

}
