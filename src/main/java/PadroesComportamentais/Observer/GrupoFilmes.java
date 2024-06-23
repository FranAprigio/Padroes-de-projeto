package PadroesComportamentais.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class GrupoFilmes implements Subject {

    private final List<Observer> observadores;
    private String titulo;

    public GrupoFilmes() {
        observadores = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observadores.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificar() {
        for (Observer observador : observadores) {
            observador.update(titulo);
        }
    }

    public int totalObservadores(){
        return observadores.size();
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
        notificar();
    }
}
