package PadroesComportamentais.Memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class JogadorTest {

    @Test
    void deveArmazenarEstados() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoAFK.getInstance());
        jogador.setEstado(JogadorEstadoAtivo.getInstance());
        assertEquals(2, jogador.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoAFK.getInstance());
        jogador.setEstado(JogadorEstadoAtivo.getInstance());
        jogador.restauraEstado(0);
        assertEquals("AFK", jogador.getEstado().getNomeEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoAFK.getInstance());
        jogador.setEstado(JogadorEstadoDescansado.getInstance());
        jogador.setEstado(JogadorEstadoAtivo.getInstance());
        jogador.setEstado(JogadorEstadoCombate.getInstance());
        jogador.restauraEstado(2);
        assertEquals("Ativo", jogador.getEstado().getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Jogador jogador = new Jogador();
            jogador.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

    @Test
    void deveArmazenarERecuperarEstadoCombate() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoCombate.getInstance());
        assertEquals("Combate", jogador.getEstado().getNomeEstado());
        jogador.restauraEstado(0);
        assertEquals("Combate", jogador.getEstado().getNomeEstado());
    }

    @Test
    void deveArmazenarERecuperarEstadoDescansado() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoDescansado.getInstance());
        assertEquals("Descansado", jogador.getEstado().getNomeEstado());
        jogador.restauraEstado(0);
        assertEquals("Descansado", jogador.getEstado().getNomeEstado());
    }
}
