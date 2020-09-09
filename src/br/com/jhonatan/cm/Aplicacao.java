package br.com.jhonatan.cm;

import br.com.jhonatan.cm.modelo.Tabuleiro;
import br.com.jhonatan.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}
