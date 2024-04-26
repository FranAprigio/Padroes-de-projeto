package PadroesEstruturais.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class GrupoRPG {

    private List<Jogador> jogadores = new ArrayList<>();

    public void convidar(String nomeJogador, String nomeClasse, String funcao) {
        Classe classe = FlyweightClasseFactory.getClasse(nomeClasse, funcao);
        Jogador jogador = new Jogador(nomeJogador, classe);
        jogadores.add(jogador);
    }

    public List<String> obterJogadores() {
        List<String> saida = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            saida.add(jogador.obterJogador());
        }
        return saida;
    }
}