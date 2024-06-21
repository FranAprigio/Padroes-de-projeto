package PadroesComportamentais.Observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GrupoFilmesTest {

    @Test
    void deveRotornarrDadosFilme() {
        GrupoFilmes filme = new GrupoFilmes();
        Pessoa filme1 = new Pessoa();
        filme1.setUltimaNotificacao("Filme " + filme1 + "Aligado com sucesso");
        Pessoa filme2 = new Pessoa();
        filme2.setUltimaNotificacao("Filme " + filme2 + "Aligado com sucesso");

        filme.addObserver(filme1);
        filme.addObserver(filme2);

        filme.setTitulo("Divertida Mente");
        filme.setTitulo("Expresso do Amanhã");

        filme.deleteObserver(filme1);
        filme.setTitulo("1917");

        assertNotNull(filme);
    }

    @Test
    public void deveExibirUltimaNotificacaoCorretamente() {
        GrupoFilmes filme = new GrupoFilmes();
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setUltimaNotificacao("Filme " + pessoa1.getNome() + " Alugado com sucesso");

        filme.addObserver(pessoa1);
        filme.setTitulo("Filme A");
        assertEquals("Filme A", pessoa1.getUltimaNotificacao());

        pessoa1.exibir();
    }

    @Test
    public void deveRemoverObservadoresCorretamente() {
        GrupoFilmes filme = new GrupoFilmes();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        filme.addObserver(pessoa1);
        filme.addObserver(pessoa2);
        filme.deleteObserver(pessoa1);

        assertEquals(1, filme.totalObservadores());
    }
}
