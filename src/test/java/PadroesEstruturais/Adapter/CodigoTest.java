package PadroesEstruturais.Adapter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodigoTest {
    @Test
    public void deveRetornarValorA() {
        Codigo codigo = new Codigo();
        codigo.setRevisao("A");

        assertEquals("A", codigo.getRevisao());
    }

    @Test
    public void deveRetornarLetraAluno() {
        Codigo codigo = new Codigo();
        codigo.setRevisao("A");

        assertEquals("F", codigo.getLetra());
    }
}
