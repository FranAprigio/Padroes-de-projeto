package PadroesComportamentais.Observer;

import java.util.Observable;

public class Pessoa implements Observer {

    private String nome;
    private String ultimaNotificacao;

    @Override
    public void update(String ultimaNotificacao) {
        this.ultimaNotificacao = ultimaNotificacao;
        System.out.println(this.toString());
    }

    public void exibir() {
        System.out.println("Livro reservado para: " + this.nome  + " :" +  this.ultimaNotificacao);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    public void setUltimaNotificacao(String ultimaNotificacao) {
        this.ultimaNotificacao = ultimaNotificacao;
    }

}
