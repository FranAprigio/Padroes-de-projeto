package PadroesCriacao.Prototype;

public class Bolo implements Cloneable{
    private String nomeDaReceita;
    private Receita receita;

    public Bolo(String nomeDaReceita, Receita receita) {
        this.nomeDaReceita = nomeDaReceita;
        this.receita = receita;
    }

    public String getNomeDaReceita() {
        return nomeDaReceita;
    }

    public void setNomeDaReceita(String nomeDaReceita) {
        this.nomeDaReceita = nomeDaReceita;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
    @Override
    public Bolo clone() throws CloneNotSupportedException {
        Bolo boloClone = (Bolo) super.clone();
        boloClone.receita = (Receita) boloClone.receita.clone();
        return boloClone;
    }

    @Override
    public String toString() {
        return "Bolo { " +
                "Nome da receita = '" + nomeDaReceita + "', " +
                receita +
                '}';
    }

}
