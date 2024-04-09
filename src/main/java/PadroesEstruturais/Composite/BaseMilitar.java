package PadroesEstruturais.Composite;

public class BaseMilitar {
    private Formacao brigada;

    public void setBrigada(Formacao brigada) {
        this.brigada = brigada;
    }

    public String getBrigada() {
        if (this.brigada == null) {
            throw new NullPointerException("Base inoperante");
        }
        return this.brigada.getFormacao();
    }
}
