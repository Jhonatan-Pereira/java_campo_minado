package br.com.jhonatan.cm;

import br.com.jhonatan.cm.modelo.Tabuleiro;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		System.out.println(tabuleiro);
	}
}
