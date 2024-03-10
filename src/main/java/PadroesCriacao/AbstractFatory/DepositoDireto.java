package PadroesCriacao.AbstractFatory;

import PadroesCriacao.AbstractFatory.Interface.Saque;

public class DepositoDireto implements Saque {
    private String nomeFavorecido;
    private double valor;
    public String getNomeFavorecido(){
        return nomeFavorecido;
    }
    public void setNomeFavorecido(String nomeFavorecido){
        this.nomeFavorecido = nomeFavorecido;
    }
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    @Override
    public void retirarDinheiro() {
        System.out.println("Depósito efetuado com SUCESSO.");
    }
}
