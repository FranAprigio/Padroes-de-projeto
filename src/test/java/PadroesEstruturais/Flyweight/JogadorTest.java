package PadroesEstruturais.Flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogadorTest {

    @Test
    void deveRetornarJogadores() {
        GrupoRPG grupo = new GrupoRPG();
        grupo.convidar("Fran", "Druida", "Dano");
        grupo.convidar("Arthur", "Guerreiro", "Tank");
        grupo.convidar("Igor", "Sacerdote", "Healer");

        List<String> saida = Arrays.asList(
                "Jogador{nome='Fran', classe='Druida', funcao='Dano'}",
                "Jogador{nome='Arthur', classe='Guerreiro', funcao='Tank'}",
                "Jogador{nome='Igor', classe='Sacerdote', funcao='Healer'}");

        assertEquals(saida, grupo.obterJogadores());
    }

    @Test
    void deveRetornarTotalClasses() {
        GrupoRPG grupo = new GrupoRPG();
        grupo.convidar("Fran", "Druida", "Dano");
        grupo.convidar("Arthur", "Guerreiro", "Tank");
        grupo.convidar("Igor", "Sacerdote", "Healer");
        grupo.convidar("Luis", "Druida", "Healer");

        assertEquals(3, FlyweightClasseFactory.getTotalClasses());
    }
}
