package br.com.jhonatan.cm.visao;

import javax.swing.JPanel;

import br.com.jhonatan.cm.modelo.Tabuleiro;

import java.awt.GridLayout;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {

  public PainelTabuleiro(Tabuleiro tabuleiro) {

    setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

    // int total = tabuleiro.getLinhas() * tabuleiro.getColunas();

    // for(int i = 0; i < total; i++) {
    //   add(new BotaoCampo(null));
    // }

    tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));

    tabuleiro.registrarObservador(e -> {
      // TODO: mostrar resultado para o usuário!

      // tabuleiro.reiniciar();
    });

  }

}
