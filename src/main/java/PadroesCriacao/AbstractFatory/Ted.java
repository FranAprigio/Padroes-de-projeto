package PadroesCriacao.AbstractFatory;

import PadroesCriacao.AbstractFatory.Interface.Deposito;

public class Ted implements Deposito {
    private String numeroConta;
    private String numeroAgencia;

    public String getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public String getNumeroAgencia(){
        return numeroAgencia;
    }
    public void setNumeroAgencia(String numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }
    @Override
    public void adicionarDinheiro() {
        System.out.println("Transferência Eletrônica realizada com SUCESSO.");
        System.out.println("O valor será enviar para a conta informada.");
    }

}
