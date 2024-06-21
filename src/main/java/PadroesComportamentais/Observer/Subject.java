package PadroesComportamentais.Observer;

public interface Subject {

    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notificar();
}
