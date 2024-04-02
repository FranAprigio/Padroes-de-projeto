package PadroesEstruturais.Bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemakeTest {

    @Test
    public void deveRetornarJogoRemakeComDLCconteudoExtra() {
        Jogo jogo = new DlcConteudoExtra();
        Remake remake = new Remake(240.0f);
        remake.setJogo(jogo);
        remake.setMesesPassados(2);
        assertEquals(270.0f, remake.calcularPreco(), 0.01f);
    }
}
