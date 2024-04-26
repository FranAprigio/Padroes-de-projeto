package PadroesEstruturais.Flyweight;

public class Classe {

    private String nome;
    private String funcao;

    public Classe(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }
}