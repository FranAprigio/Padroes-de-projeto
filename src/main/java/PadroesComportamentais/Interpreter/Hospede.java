package PadroesComportamentais.Interpreter;

public class Hospede {

    private Integer tempo;
    private Integer quarto;

    public Hospede(Integer tempo, Integer quarto) {
        this.tempo = tempo;
        this.quarto = quarto;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public Integer getQuarto() {
        return quarto;
    }

    public void setQuarto(Integer quarto) {
        this.quarto = quarto;
    }

    public Double consultarValorEstadia(){
        return Hotel.calcularEstadia(this);
    }
}
