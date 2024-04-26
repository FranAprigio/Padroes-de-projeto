package PadroesEstruturais.Decorator;

public class Mira extends ArmaDecorator{

    public Mira(Arma arma) {
        super(arma);
    }

    public float getAumentoDePreco() {
        return 518.0f;
    }

    public String getNomePeca() {
        return "Mira telescopica '6x24x60'";
    }
}
