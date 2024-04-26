package PadroesEstruturais.Adapter;

public class Guerreiro {
    IAvaliacaoGuerreiro avaliacao;
    AvaliacaoAdapter persistencia;

    public Guerreiro() {
        avaliacao = new AvaliacaoGuerreiro();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setAvaliacao(conceito);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    public float getInteligencia() {
        return persistencia.getInteligencia();
    }
}
