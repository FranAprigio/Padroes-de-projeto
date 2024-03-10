package PadroesCriacao.AbstractFatory;

import PadroesCriacao.AbstractFatory.Interface.Deposito;
import PadroesCriacao.AbstractFatory.Interface.Extrato;
import PadroesCriacao.AbstractFatory.Interface.PagamentoOnline;
import PadroesCriacao.AbstractFatory.Interface.Saque;

public class CarteiraVirtual {
    private String nome;
    private String cpf;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public Saque saque;
    public Deposito deposito;
    public Extrato extrato;
    public CarteiraVirtual(PagamentoOnline carteiraVirtual){
        this.saque = carteiraVirtual.retirarDinheiro();
        this.deposito = carteiraVirtual.adicionarDinheiro();
        this.extrato = carteiraVirtual.exibirDinheiro();
    }

}
