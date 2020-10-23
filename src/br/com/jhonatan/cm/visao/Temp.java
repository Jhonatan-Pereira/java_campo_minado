package br.com.jhonatan.cm.visao;

import br.com.jhonatan.cm.modelo.Tabuleiro;

public class Temp {
  public static void main(String[] args) {
    Tabuleiro tabuleiro = new Tabuleiro(3, 3, 9);

    tabuleiro.registrarObservador(e -> {
      if(e.isGanhou()) {
        System.out.println("ganhou");
      } else {
        System.out.println("perdeu");
      }
    });

    tabuleiro.abrir(2, 2);
  }
}
