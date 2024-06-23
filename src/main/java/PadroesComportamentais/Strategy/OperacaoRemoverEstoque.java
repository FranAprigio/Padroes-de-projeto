package PadroesComportamentais.Strategy;

public class OperacaoRemoverEstoque implements Operacao{

    @Override
    public int calcularEstoque(int quantidade1, int quantidade2) {
        return quantidade1 - quantidade2;
    }
}
