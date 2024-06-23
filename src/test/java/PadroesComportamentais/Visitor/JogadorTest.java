package PadroesComportamentais.Visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogadorTest {

    @Test
    void deveExibirJogador() {
        Jogador jogador = new Jogador(6513, "Arthur", new Jogo("World of Warcraft"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Jogador{batleNetId=6513, nome='Arthur', jogo=World of Warcraft}", visitor.exibir(jogador));
    }

    @Test
    void deveExibirProfessor() {
        Administrador administrador = new Administrador(9999, "Caio", "SIM");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Administrador{codigoId=9999, nome='Caio', permissão para banir='SIM'}", visitor.exibir(administrador));
    }
}
