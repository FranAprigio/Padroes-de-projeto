package PadroesEstruturais.Adapter;

public class AvaliacaoAdapter extends AvaliacaoInteligencia{
    private IAvaliacaoGuerreiro avaliacaoGuerreiro;

    public AvaliacaoAdapter(IAvaliacaoGuerreiro avaliacaoGuerreiro) {
        this.avaliacaoGuerreiro = avaliacaoGuerreiro;
    }

    public String recuperarAvaliacao() {
        if (this.getInteligencia() >= 9.0f)
            avaliacaoGuerreiro.setAvaliacao("Alta");
        else
        if (this.getInteligencia() >= 6.0f)
            avaliacaoGuerreiro.setAvaliacao("Média");
        else
        if (this.getInteligencia() >= 4.0f)
            avaliacaoGuerreiro.setAvaliacao("Baixa");
        else
            avaliacaoGuerreiro.setAvaliacao("Reprovado");
        return avaliacaoGuerreiro.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoGuerreiro.getAvaliacao().equals("Alta"))
            this.setInteligencia(9.0f);
        else
        if (avaliacaoGuerreiro.getAvaliacao().equals("Média"))
            this.setInteligencia(6.0f);
        else
        if (avaliacaoGuerreiro.getAvaliacao().equals("Baixa"))
            this.setInteligencia(4.0f);
        else
            this.setInteligencia(1.0f);
    }
}
