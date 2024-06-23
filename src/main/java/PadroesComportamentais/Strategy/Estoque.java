package PadroesComportamentais.Strategy;

public class Estoque {
    private int quantidade1;
    private int quantidade2;

    public Estoque(int quantidade1, int quantidade2) {
        this.quantidade1 = quantidade1;
        this.quantidade2 = quantidade2;
    }

    public int calcularEstoque(Operacao operacao) {
        return operacao.calcularEstoque(quantidade1, quantidade2);
    }
}
