package PadroesComportamentais.Strategy;

public class Funcionario {

    private int quantidadeEstoque;

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidadeInicial, int quantidadeCalculada) {
        Estoque estoque = new Estoque(quantidadeInicial, quantidadeCalculada);
        this.quantidadeEstoque = estoque.calcularEstoque(new OperacaoAdicionarEstoque());
    }

    public void subtrairEstoque(int quantidadeInicial, int quantidadeCalculada) {
        Estoque estoque = new Estoque(quantidadeInicial, quantidadeCalculada);
        this.quantidadeEstoque = estoque.calcularEstoque(new OperacaoRemoverEstoque());
    }
}
