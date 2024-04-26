package PadroesEstruturais.Composite;

public abstract class Formacao {

    private String descricao;

    public Formacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getFormacao();
}
