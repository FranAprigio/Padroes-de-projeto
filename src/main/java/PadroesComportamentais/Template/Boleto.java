package PadroesComportamentais.Template;

public abstract class Boleto {

    private int numeroBoleto;
    private int diasAtraso;
    protected String nome;
    private float valor;
    private float desconto;

    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public abstract String verificarAtraso();

    public abstract String verificarBoletoEmDia();

    public String getTipo() {
        return "Boleto";
    }

    // Template Method
    public String getInfo() {
        return getTipo() + "{" +
                "Numero do boleto=" + this.numeroBoleto +
                ", Nome='" + this.nome + '\'' +
                ", Valor='" + this.valor + '\'' +
                ", Desconto='" + this.desconto + '\'' +
                ", Está atrasado? " + this.verificarAtraso() +
                ", " + this.verificarBoletoEmDia() +
                '}';
    }
}
