package PadroesCriacao.FactoryMethod;


import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class ServicoDeleteTest {

    @Test
    void deveExecutarExclusao() {
        IService servico = ServiceFactory.obterServico("Delete");
        Assert.assertEquals("Linha Excluida", servico.executar());
    }
    @Test
    void deveCancelarExclusao() {
        IService servico = ServiceFactory.obterServico("Delete");
        Assert.assertEquals("Operacao de cancelar eclusão da linha", servico.cancelar());
    }
}
