package PadroesCriacao.AbstractFatory.Interface;

public interface PagamentoOnline {
    Saque retirarDinheiro();
    Deposito adicionarDinheiro();
    Extrato exibirDinheiro();
}
