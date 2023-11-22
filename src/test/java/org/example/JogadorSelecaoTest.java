package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JogadorSelecaoTest {
    @Test
    void deveRetornarDesempenho() {
        JogadorSelecao jogador = new JogadorSelecao();
        jogador.setTempoJogo(50.0);
        jogador.setNota(7);
        assertEquals(7.56, jogador.calcularDesempenho());
    }

    @Test
    void deveAvaliarDesempenhoComoExcelente() {
        JogadorSelecao jogador = new JogadorSelecao();
        jogador.setTempoJogo(90.0);
        jogador.setNota(8);
        assertEquals("Excelente Jogo", jogador.avaliarDesempenho());
    }
//
    @Test
    void deveAvaliarDesempenhoComoBom() {
        JogadorSelecao jogador = new JogadorSelecao();
        jogador.setTempoJogo(30.0);
        jogador.setNota(6);
        assertEquals("Bom Jogo", jogador.avaliarDesempenho());
    }
//
    @Test
    void deveAvaliarDesempenhoComoRuim() {
        JogadorSelecao jogador = new JogadorSelecao();
        jogador.setTempoJogo(90.0);
        jogador.setNota(3);
        assertEquals("Jogo Ruim", jogador.avaliarDesempenho());
    }
//
    @Test
    void deveRetornarInformacoes() {
        JogadorSelecao jogador = new JogadorSelecao();
        jogador.setNome("João");
        jogador.setId(1);
        jogador.setTempoJogo(90.0);
        jogador.setNota(3);
        assertEquals("JogadorSelecao{id=1, nome='João', nota desempenho=4.0}", jogador.getInfo());
    }
}