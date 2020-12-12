package dev.luanfernandes.cm;

import dev.luanfernandes.cm.modelo.Tabuleiro;
import dev.luanfernandes.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}

}
