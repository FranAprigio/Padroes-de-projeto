package PadroesComportamentais.Template;

public class BoletoComDesconto extends Boleto {

    @Override
    public String verificarAtraso() {
        if (this.getDiasAtraso() > 0) {
            return "Atrasado";
        } else {
            return "Em dia";
        }
    }

    @Override
    public String verificarBoletoEmDia() {
        if (this.getDiasAtraso() <= 0) {
            return "Seu boleto está em dia e tem um desconto de R$ " + this.getDesconto();
        } else {
            return "Seu boleto está em atraso e não tem desconto";
        }
    }

}
