package PadroesEstruturais.Facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void retornarPendenciaDocumentacao() {
        Cliente cliente = new Cliente();
        Documentacao.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.retirarCarro());
    }

    @Test
    void retornarPendenciaFinanceiro() {
        Cliente cliente = new Cliente();
        Financeiro.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.retirarCarro());
    }

    @Test
    void retornarClienteSemPendencia() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.retirarCarro());
    }
}