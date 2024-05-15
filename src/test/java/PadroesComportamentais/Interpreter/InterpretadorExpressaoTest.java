package PadroesComportamentais.Interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class InterpretadorExpressaoTest {


    @Test
    void deveCalcularEstadiaHospede() {
        Hospede hospede = new Hospede(3, 101);
        assertEquals(80.0, hospede.consultarValorEstadia());
    }

    @Test
    void deveAtualizarTempoHospede() {
        Hospede hospede = new Hospede(3, 101);
        hospede.setTempo(5);
        assertEquals(5, hospede.getTempo());
    }

    @Test
    void deveAtualizarQuartoHospede() {
        Hospede hospede = new Hospede(3, 101);
        hospede.setQuarto(102);
        assertEquals(102, hospede.getQuarto());
    }
    @Test
    void deveCalcularExpressaoSoma() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 + 2");
        assertEquals(8.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoSubtracao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 - 2");
        assertEquals(4.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoMultiplicacao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 * 2");
        assertEquals(12.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoDivisao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 / 2");
        assertEquals(3.0, interpretador.interpretar());
    }


    @Test
    void deveCalcularExpressaoCombinada() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("10 / 2 * 3 + 1 - 4");
        assertEquals(12.0, interpretador.interpretar());
    }

    @Test
    void deveRetonarExcecaoElementoInvalido() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("2 ^ 2");
            assertEquals(4.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoInvalida() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("2 +");
            assertEquals(4.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão inválida", e.getMessage());
        }
    }

}
