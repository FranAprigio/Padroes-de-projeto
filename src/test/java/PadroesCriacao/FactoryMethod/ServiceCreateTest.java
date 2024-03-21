package PadroesCriacao.FactoryMethod;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ServiceCreateTest {
    @Test
    public void deveExecutarCriacao() {
        IService servico = ServiceFactory.obterServico("Create");
        assertEquals("Linha criada", servico.executar());
    }
    @Test
    public void deveCancelarCriacao() {
        IService servico = ServiceFactory.obterServico("Create");
        assertEquals("Operacao de cancelar criaçãp da linha", servico.cancelar());
    }
}
