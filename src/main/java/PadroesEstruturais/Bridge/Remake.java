package PadroesEstruturais.Bridge;

public class Remake extends Valor{
    private int numMeses;
    public Remake(float precoBase) {
        super(precoBase);
    }
    public void setMesesPassados(int numMeses) {
        this.numMeses = numMeses;
    }
    public float calcularPreco() {
        return (this.precoBase - (30.0f * this.numMeses)) * (1 + this.jogo.acrescimo());
    }
}
