package PadroesCriacao.Prototype;

public class Receita implements Cloneable{
    private int Ovos;
    private int LitroLeite;
    private int ColherFarinhaTrigo;

    public Receita(int Ovos, int LitroLeite, int ColherFarinhaTrigo) {
        super();
        this.Ovos = Ovos;
        this.LitroLeite = LitroLeite;
        this.ColherFarinhaTrigo = ColherFarinhaTrigo;
    }

    public int getOvos() {
        return Ovos;
    }

    public void setOvos(int Ovos) {
        this.Ovos = Ovos;
    }

    public int getLitroLeite() {
        return LitroLeite;
    }

    public void setLitroLeite(int LitroLeite) {
        this.LitroLeite = LitroLeite;
    }

    public int getColherFarinhaTrigo() {
        return ColherFarinhaTrigo;
    }

    public void setColherFarinhaTrigo(int ColherFarinhaTrigo) {
        this.ColherFarinhaTrigo = ColherFarinhaTrigo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Receita { " +
                "Numero de Ovos = " + Ovos + "" +
                ", Litro de Leite = " + LitroLeite + "" +
                ", Colher de Farinha = " + ColherFarinhaTrigo + "" +
                '}';
    }
}
