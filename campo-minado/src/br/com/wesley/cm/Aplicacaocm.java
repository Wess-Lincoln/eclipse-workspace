package br.com.wesley.cm;

import model.cm.Tabuleiro;

public class Aplicacaocm {
		public static void main(String[] args) {
			
			Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
			//tabuleiro.abrir(3, 3);
			//tabuleiro.alternarMarcacao(4,5);
			
			System.out.println(tabuleiro);
			
		}
}
