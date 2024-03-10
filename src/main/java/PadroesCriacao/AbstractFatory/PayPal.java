package PadroesCriacao.AbstractFatory;

import PadroesCriacao.AbstractFatory.Interface.Deposito;
import PadroesCriacao.AbstractFatory.Interface.Extrato;
import PadroesCriacao.AbstractFatory.Interface.PagamentoOnline;
import PadroesCriacao.AbstractFatory.Interface.Saque;

public class PayPal implements PagamentoOnline {
    @Override
    public Saque retirarDinheiro() {
        return new DepositoDireto();
    }
    @Override
    public Deposito adicionarDinheiro() {
        return new Ted();
    }
    @Override
    public Extrato exibirDinheiro() {
        return new Demostrativo();
    }
}
