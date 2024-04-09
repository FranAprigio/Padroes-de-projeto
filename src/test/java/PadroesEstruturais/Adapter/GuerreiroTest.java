package PadroesEstruturais.Adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GuerreiroTest {

    @Test
    void retornarConceitoGuerreiroAlta() {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setAvaliacao("Alta");

        assertEquals("Alta", guerreiro.getAvaliacao());
    }

    @Test
    void retornarConceitoGuerreiroMedia() {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setAvaliacao("Média");

        assertEquals("Média", guerreiro.getAvaliacao());
    }

    @Test
    void retornarConceitoGuerreiroBaixa() {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setAvaliacao("Baixa");

        assertEquals("Baixa", guerreiro.getAvaliacao());
    }

    @Test
    void retornarConceitoGuerreiroReprovadp() {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setAvaliacao("Reprovado");

        assertEquals("Reprovado", guerreiro.getAvaliacao());
    }

    @Test
    void retornarInteligenciaGuerreiro() {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setAvaliacao("Reprovado");

        assertEquals(1.0, guerreiro.getInteligencia(), 0.001);
    }
}