package PadroesCriacao.FactoryMethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceCreateTest {
    @Test
    void deveExecutarCriacao() {
        IService servico = ServiceFactory.obterServico("Create");
        assertEquals("Linha criada", servico.executar());
    }
    @Test
    void deveCancelarCriacao() {
        IService servico = ServiceFactory.obterServico("Create");
        assertEquals("Operacao de cancelar criaçãp da linha", servico.cancelar());
    }
}
