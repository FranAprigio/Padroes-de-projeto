package PadroesEstruturais.Composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BaseMilitarTest {
    @Test
    void retornarEstruturaBase() {
        Brigada brigada1 = new Brigada("Artilharia");
        Pelotao pelotao1 = new Pelotao("Soldados", 400);
        brigada1.addFormacao(pelotao1);

        pelotao1.setDescricao("Soldados");
        pelotao1.setEfetivo(400);

        BaseMilitar baseMilitar = new BaseMilitar();
        baseMilitar.setBrigada(brigada1);

        assertEquals(400, pelotao1.getEfetivo());
        assertEquals("Brigada: Artilharia\n" +
                        "Pelotão: Soldados - Efetivo: 400\n",
                baseMilitar.getBrigada());
    }

    @Test
    void retornarExecacaoBaseSemBrigada() {
        try {
            BaseMilitar baseMilitar = new BaseMilitar();
            baseMilitar.getBrigada();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Base inoperante", e.getMessage());
        }
    }

    @Test
    void retornarEstruturaBrigada() {
        Brigada brigada = new Brigada("Infantaria");

        Pelotao pelotao1 = new Pelotao("Soldados", 200);
        Pelotao pelotao2 = new Pelotao("Médicos", 50);

        brigada.addFormacao(pelotao1);
        brigada.addFormacao(pelotao2);

        pelotao1.setDescricao("Soldados");
        pelotao2.setEfetivo(50);

        assertEquals("Brigada: Infantaria\n" +
                        "Pelotão: Soldados - Efetivo: 200\n" +
                        "Pelotão: Médicos - Efetivo: 50\n",
                brigada.getFormacao());
    }

    @Test
    void retornarEstruturaPelotao() {
        Pelotao pelotao = new Pelotao("Engenheiros", 100);
        pelotao.setDescricao("Engenheiros de Combate");
        pelotao.setEfetivo(100);

        assertEquals("Pelotão: Engenheiros de Combate - Efetivo: 100\n",
                pelotao.getFormacao());
    }
}
