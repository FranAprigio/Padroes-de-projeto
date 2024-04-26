package PadroesEstruturais.Decorator;

public abstract class ArmaDecorator implements Arma{

    private Arma arma;
    public String peca;

    public ArmaDecorator(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public abstract float getAumentoDePreco();

    public float getPreco() {
        return this.arma.getPreco() + this.getAumentoDePreco();
    }

    public abstract String getNomePeca();

    public String getPeca() {
        return this.arma.getPeca() + " + " + this.getNomePeca();
    }
    public void setPeca(String peca) {
        this.peca = peca;
    }
}
