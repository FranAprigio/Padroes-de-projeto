package PadroesComportamentais.Memento;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private JogadorEstado estado;
    private List<JogadorEstado> memento = new ArrayList<JogadorEstado>();

    public JogadorEstado getEstado() {
        return this.estado;
    }

    public void setEstado(JogadorEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<JogadorEstado> getEstados() {
        return this.memento;
    }
}
