package PadroesCriacao.FactoryMethod;

import org.junit.Assert;
import org.junit.Test;


public class ServicoDeleteTest {

    @Test
    public void deveExecutarExclusao() {
        IService servico = ServiceFactory.obterServico("Delete");
        Assert.assertEquals("Linha Excluida", servico.executar());
    }
    @Test
    public void deveCancelarExclusao() {
        IService servico = ServiceFactory.obterServico("Delete");
        Assert.assertEquals("Operacao de cancelar eclusão da linha", servico.cancelar());
    }
}
