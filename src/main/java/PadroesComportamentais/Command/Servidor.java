package PadroesComportamentais.Command;

public class Servidor {

    private String situacao;
    private float storage;

    public Servidor(float storage){
        this.storage = storage;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirServidor() {
        this.situacao = "Servidor aberto";

    }

    public void fecharServidor() {
        this.situacao = "Servidor fechado";
    }
}
