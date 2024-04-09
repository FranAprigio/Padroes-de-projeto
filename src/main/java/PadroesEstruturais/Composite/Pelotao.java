package PadroesEstruturais.Composite;

public class Pelotao extends Formacao{

    private int efetivo;

    public Pelotao(String descricao, int efetivo) {
        super(descricao);
        this.efetivo = efetivo;
    }

    public int getEfetivo() {
        return efetivo;
    }

    public void setEfetivo(int efetivo) {
        this.efetivo = efetivo;
    }

    public String getFormacao() {
        return "Pelotão: " + this.getDescricao() + " - Efetivo: " + this.efetivo + "\n";
    }

}
