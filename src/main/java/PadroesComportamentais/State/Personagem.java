package PadroesComportamentais.State;

public class Personagem {

    private String nome;
    private PersonagemEstado estado;

    public Personagem() {
        this.estado = PersonagemEstadoVivo.getInstance();
    }

    public void setEstado(PersonagemEstado estado) {
        this.estado = estado;
    }
    public boolean Vivo() {
        return estado.Vivo(this);
    }

    public boolean Combater() {
        return estado.Combater(this);
    }

    public boolean Morrer() {
        return estado.Morrer(this);
    }
    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PersonagemEstado getEstado() {
        return estado;
    }
}
