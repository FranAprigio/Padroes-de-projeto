package PadroesEstruturais.Decorator;

public class CarregadorExtendido extends ArmaDecorator{

    public CarregadorExtendido(Arma arma) {
        super(arma);
    }
    public float getAumentoDePreco() {
        return 160.0f;
    }

    public String getNomePeca() {
        return "Carregador '32 rounds'";
    }
}
