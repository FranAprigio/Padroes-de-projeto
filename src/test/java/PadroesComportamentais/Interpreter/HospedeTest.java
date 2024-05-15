package PadroesComportamentais.Interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospedeTest {

    @Test
    void deveCalcularEstadia(){
        Hospede hospede = new Hospede(30, 505);
        assertEquals(1750.0, hospede.consultarValorEstadia());
    }
}
