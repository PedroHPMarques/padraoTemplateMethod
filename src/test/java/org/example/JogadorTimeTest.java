package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTimeTest {
    @Test
    void deveRetornarDesempenho() {
        JogadorTime jogador = new JogadorTime();
        jogador.setTempoJogo(50.0);
        jogador.setNota(7);
        assertEquals(7.56, jogador.calcularDesempenho());
    }

    @Test
    void deveAvaliarDesempenhoComoExcelente() {
        JogadorTime jogador = new JogadorTime();
        jogador.setTempoJogo(90.0);
        jogador.setNota(8);
        assertEquals("Excelente Jogo", jogador.avaliarDesempenho());
    }
    //
    @Test
    void deveAvaliarDesempenhoComoBom() {
        JogadorTime jogador = new JogadorTime();
        jogador.setTempoJogo(30.0);
        jogador.setNota(6);
        assertEquals("Bom Jogo", jogador.avaliarDesempenho());
    }
    //
    @Test
    void deveAvaliarDesempenhoComoRuim() {
        JogadorTime jogador = new JogadorTime();
        jogador.setTempoJogo(90.0);
        jogador.setNota(3);
        assertEquals("Jogo Ruim", jogador.avaliarDesempenho());
    }
    //
    @Test
    void deveRetornarInformacoes() {
        JogadorTime jogador = new JogadorTime();
        jogador.setNome("João");
        jogador.setId(1);
        jogador.setTempoJogo(90.0);
        jogador.setNota(3);
        assertEquals("JogadorTime{id=1, nome='João', nota desempenho=4.0}", jogador.getInfo());
    }

}