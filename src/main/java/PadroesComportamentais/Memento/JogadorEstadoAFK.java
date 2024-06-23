package PadroesComportamentais.Memento;

public class JogadorEstadoAFK implements JogadorEstado{

    private JogadorEstadoAFK() {};
    private static JogadorEstadoAFK instance = new JogadorEstadoAFK();
    public static JogadorEstadoAFK getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "AFK";
    }
}
