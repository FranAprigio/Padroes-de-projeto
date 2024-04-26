package PadroesEstruturais.Composite;

import java.util.ArrayList;
import java.util.List;

public class Brigada extends Formacao{

    private List<Formacao> formacoes;

    public Brigada(String descricao) {
        super(descricao);
        this.formacoes = new ArrayList<Formacao>();
    }
    public void addFormacao(Formacao formacao) {
        this.formacoes.add(formacao);
    }

    public String getFormacao() {
        String saida = "";
        saida = "Brigada: " + this.getDescricao() + "\n";
        for (Formacao formacao : formacoes) {
            saida += formacao.getFormacao();
        }
        return saida;
    }
}
