package PadroesCriacao.Prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BoloTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Bolo bolo = new Bolo( "Receita Vovó Cuca", new Receita(4, 1, 3));

        Bolo boloClone = bolo.clone();
        boloClone.setNomeDaReceita("Receita Vovó Clonada");
        boloClone.getReceita().setOvos(3);
        boloClone.getReceita().setLitroLeite(1);
        boloClone.getReceita().setColherFarinhaTrigo(3);

        assertEquals(4, bolo.getReceita().getOvos());
        assertEquals(1, bolo.getReceita().getLitroLeite());
        assertEquals(3, bolo.getReceita().getColherFarinhaTrigo());
        assertEquals("Bolo { Nome da receita = 'Receita Vovó Cuca', Receita { Numero de Ovos = 4, Litro de Leite = 1, Colher de Farinha = 3}}", bolo.toString());
        assertEquals("Bolo { Nome da receita = 'Receita Vovó Clonada', Receita { Numero de Ovos = 3, Litro de Leite = 1, Colher de Farinha = 3}}", boloClone.toString());

        assertNotEquals(bolo.toString(), boloClone.toString());
        assertNotEquals(bolo.getNomeDaReceita(),boloClone.getNomeDaReceita());

        Receita novaReceita = new Receita(2, 2, 2);

        bolo.setReceita(novaReceita);
        assertEquals(novaReceita, bolo.getReceita());

    }
}
