package PadroesComportamentais.Iterator;

public class Usuario {
    private String nome;
    private boolean banido;

    public Usuario(String nome, boolean status) {
        this.nome = nome;
        this.banido = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean estaBinido() {
        return banido;
    }

}
