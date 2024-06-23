package PadroesComportamentais.Template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoletoTest {

    @Test
    void deveRetornarBoletoEmAtraso(){

        Boleto boletoEmAtraso = new BoletoEmAtraso();
        boletoEmAtraso.setNumeroBoleto(12345);
        boletoEmAtraso.setNome("João da Silva");
        boletoEmAtraso.setValor(150.75f);
        boletoEmAtraso.setDiasAtraso(5);
        boletoEmAtraso.setDesconto(0);
        System.out.println(boletoEmAtraso.getInfo());
    }
    @Test
    void deveRetornarBoletoComDesconto(){
        Boleto boletoComDescontoEmDia = new BoletoComDesconto();
        boletoComDescontoEmDia.setNumeroBoleto(54321);
        boletoComDescontoEmDia.setNome("Maria Oliveira");
        boletoComDescontoEmDia.setValor(250.00f);
        boletoComDescontoEmDia.setDiasAtraso(0);
        boletoComDescontoEmDia.setDesconto(25.00f);

        System.out.println(boletoComDescontoEmDia.getInfo());
    }

    @Test
    void deveBoletoComDescontoEmAtraso(){

        Boleto boletoComDescontoEmAtraso = new BoletoComDesconto();
        boletoComDescontoEmAtraso.setNumeroBoleto(67890);
        boletoComDescontoEmAtraso.setNome("Carlos Souza");
        boletoComDescontoEmAtraso.setValor(300.00f);
        boletoComDescontoEmAtraso.setDiasAtraso(3);
        boletoComDescontoEmAtraso.setDesconto(30.00f);

        System.out.println(boletoComDescontoEmAtraso.getInfo());
    }

    @Test
    void deveRetornarInformacoes() {
        // Testando a classe BoletoEmAtraso
        BoletoEmAtraso boletoEmAtraso = new BoletoEmAtraso();
        boletoEmAtraso.setNome("Boleto Uniacademia");
        boletoEmAtraso.setNumeroBoleto(1000999922);
        boletoEmAtraso.setDiasAtraso(4);
        boletoEmAtraso.setValor(999.33f);
        boletoEmAtraso.setDesconto(0);
        assertEquals("Boleto Uniacademia", boletoEmAtraso.getNome());
        assertEquals("Boleto{Numero do boleto=1000999922, Nome='Boleto Uniacademia', Valor='999.33', Desconto='0.0', Está atrasado? Atrasado, Seu boleto está em atraso e não tem desconto}", boletoEmAtraso.getInfo());
    }
}
