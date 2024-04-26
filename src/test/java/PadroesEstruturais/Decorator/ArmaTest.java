package PadroesEstruturais.Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArmaTest {

    @Test
    void testAdicionaArma() {
        Arma armaBase = new ArmaAirsoft();
        ArmaDecorator armaDecorada = new Mira(armaBase);

        assertEquals("Sniper 'M24' + Mira telescopica '6x24x60'", armaDecorada.getPeca());
        Arma novaArma = new ArmaAirsoft(1500.0f);
        ArmaDecorator novaArmaDecorada = new Mira(novaArma);
        armaDecorada.setArma(novaArmaDecorada);
        assertEquals("Sniper 'M24' + Mira telescopica '6x24x60'", novaArmaDecorada.getPeca());
    }

    @Test
    void testRetornaArma() {
        Arma armaBase = new ArmaAirsoft();
        ArmaDecorator armaDecorada = new Mira(armaBase);

        assertEquals("Sniper 'M24' + Mira telescopica '6x24x60'", armaDecorada.getPeca());
        Arma armaObtida = armaDecorada.getArma();
        assertEquals(armaBase, armaObtida);
    }

    @Test
    void testAnexarPeca() {
        Arma armaBase = new ArmaAirsoft();
        ArmaDecorator armaDecorada = new Mira(armaBase);

        assertEquals("Sniper 'M24' + Mira telescopica '6x24x60'", armaDecorada.getPeca());
        String newPart = "Custom Grip";
        armaDecorada.setPeca(newPart);
        assertEquals("Sniper 'M24' + Mira telescopica '6x24x60'", armaDecorada.getPeca());
    }

    @Test
    void deveRetornarPrecoArma() {
        Arma arma = new ArmaAirsoft(2900.0f);
        assertEquals(2900.0f, arma.getPreco());
    }

    @Test
    void deveRetornarNomeArma() {
        Arma arma = new ArmaAirsoft();
        assertEquals("Sniper 'M24'", arma.getPeca());
    }

    @Test
    void deveRetornarPrecoArmaComMira() {
        Arma arma = new Mira(new ArmaAirsoft(2900.0f));
        assertEquals(3418.0f, arma.getPreco());
    }

    @Test
    void deveRetornarNomeArmaComMira() {
        Arma arma = new Mira(new ArmaAirsoft());
        assertEquals("Sniper 'M24' + Mira telescopica '6x24x60'", arma.getPeca());
    }

    @Test
    void deveRetornarPrecoArmaComMiraComCarregador() {
        Arma arma = new CarregadorExtendido(new Mira(new ArmaAirsoft(2900.0f)));
        assertEquals(3578.0f, arma.getPreco());
    }

    @Test
    void deveRetornarNomeArmaComMiraComCarregador() {
        Arma arma = new CarregadorExtendido(new Mira(new ArmaAirsoft()));
        assertEquals("Sniper 'M24' + Mira telescopica '6x24x60' + Carregador '32 rounds'", arma.getPeca());
    }

    @Test
    void deveRetornarPrecoArmaComMiraComCarregadorComSilenciador() {
        Arma arma = new Silenciador(new CarregadorExtendido(new Mira(new ArmaAirsoft(2900.0f))));
        assertEquals(3744.0f, arma.getPreco());
    }

    @Test
    void deveRetornarNomeArmaComMiraComCarregadorComSilenciador() {
        Arma arma = new Silenciador(new CarregadorExtendido(new Mira(new ArmaAirsoft())));
        assertEquals("Sniper 'M24' + Mira telescopica '6x24x60' + Carregador '32 rounds' + Supressor Funcional", arma.getPeca());
    }
}