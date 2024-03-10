package PadroesCriacao.AbstractFatory;

import PadroesCriacao.AbstractFatory.Interface.Saque;

public class Saque24horas implements Saque {
    private double limiteSaque;
    public double getLimiteSaque(){
        return limiteSaque;
    }
    public void setLimiteSaque(double limiteSaque){
        this.limiteSaque = limiteSaque;
    }
    @Override
    public void retirarDinheiro() {
        System.out.println("Para sua maior comodidade, saques podem ser feitos em qualquer agência,\n" +
                "ou Banco 24 Horas.");
    }
}
