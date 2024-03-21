package PadroesCriacao.FactoryMethod;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ServiceFactoryTest {

    @Test
    public void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IService servico = ServiceFactory.obterServico("Reescrever");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IService servico = ServiceFactory.obterServico("Change");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}
