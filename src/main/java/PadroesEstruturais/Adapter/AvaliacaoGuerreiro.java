package PadroesEstruturais.Adapter;

public class AvaliacaoGuerreiro implements IAvaliacaoGuerreiro{
    private String conceito;

    @Override
    public String getAvaliacao() {
        return this.conceito;
    }

    @Override
    public void setAvaliacao(String conceito) {
        this.conceito = conceito;
    }
}
