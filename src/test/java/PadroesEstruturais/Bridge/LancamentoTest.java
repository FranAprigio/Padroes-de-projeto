package PadroesEstruturais.Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LancamentoTest {
    @Test
    void deveRetornarJogoLancamentoComDLCgratuita() {
        Jogo jogo = new DlcGratuita();
        Lancamento lancamento = new Lancamento(240.0f);
        lancamento.setJogo(jogo);
        lancamento.setMesesPassados(2);
        assertEquals(190.0f, lancamento.calcularPreco(), 0.01f);
    }
}
