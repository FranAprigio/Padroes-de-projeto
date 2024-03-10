package PadroesCriacao.AbstractFatory;

import PadroesCriacao.AbstractFatory.Interface.Extrato;

import java.util.Date;

public class Demostrativo implements Extrato {
    private Date dia;
    private Date mes;
    private double debito;
    private double credito;
    private double saldo;
    public Date getDia() {
        return dia;
    }
    public void setDia(Date dia) {
        this.dia = dia;
    }
    public Date getMes(){
        return mes;
    }
    public void setMes(Date mes){
        this.mes = mes;
    }
    public double getDebito() {
        return debito;
    }
    public void setDebito(double debito){
        this.debito = debito;
    }
    public double getCredito(){
        return credito;
    }
    public void setCredito(double credito){
        this.credito = credito;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    @Override
    public void exibirDinheiro() {
        System.out.println("Historico de Movimentação:\n");
        System.out.println("Dia: " +getDia());
        System.out.println("Mes: " +getMes());
        System.out.println("Débito - R$: "+getDebito());
        System.out.println("Crédito - R$: "+getCredito());
        System.out.println("Saldo - R$: "+getSaldo());
    }
}
