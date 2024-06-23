package PadroesComportamentais.Visitor;

public class Jogador implements Pessoa {

    private int batleNetId;
    private String nome;
    private Jogo jogo;

    public Jogador(int batleNetId, String nome, Jogo jogo) {
        this.batleNetId = batleNetId;
        this.nome = nome;
        this.jogo = jogo;
    }

    public int getBatleNetId() {
        return batleNetId;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeJogo() {
        return this.jogo.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirJogador(this);
    }
}
