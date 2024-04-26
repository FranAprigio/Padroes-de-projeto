package PadroesEstruturais.Decorator;

public class Silenciador extends ArmaDecorator{

    public Silenciador(Arma arma) {
        super(arma);
    }

    public float getAumentoDePreco() {
        return 166.0f;
    }

    public String getNomePeca() {
        return "Supressor Funcional";
    }
}
