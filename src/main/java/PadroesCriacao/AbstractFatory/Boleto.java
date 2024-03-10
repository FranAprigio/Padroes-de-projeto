package PadroesCriacao.AbstractFatory;

import PadroesCriacao.AbstractFatory.Interface.Deposito;

public class Boleto implements Deposito {
    private String codigoBarras;
    public String getCodigoBarras(){
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }
    @Override
    public void adicionarDinheiro() {
        System.out.println("Código de barras OK.");
        System.out.println("Pagamento realizado com SUCESSO.");
    }
}
