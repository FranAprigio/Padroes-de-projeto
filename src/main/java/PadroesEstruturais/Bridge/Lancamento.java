package PadroesEstruturais.Bridge;

public class Lancamento extends Valor{
    private int numMeses;
    public Lancamento(float precoBase) {
        super(precoBase);
    }
    public void setMesesPassados(int numMeses) {
        this.numMeses = numMeses;
    }
    public float calcularPreco() {
        return (this.precoBase - (25.0f * this.numMeses)) * (1 + this.jogo.acrescimo()) ;
    }
}
