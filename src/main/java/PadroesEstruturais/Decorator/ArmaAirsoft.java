package PadroesEstruturais.Decorator;

public class ArmaAirsoft implements Arma{

    public float preco;

    public ArmaAirsoft() {
    }

    public ArmaAirsoft(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getPeca() {
        return "Sniper 'M24'";
    }
}
