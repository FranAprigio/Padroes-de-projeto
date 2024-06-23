package PadroesComportamentais.Memento;

public class JogadorEstadoCombate implements JogadorEstado{
    private JogadorEstadoCombate() {};
    private static JogadorEstadoCombate instance = new JogadorEstadoCombate();
    public static JogadorEstadoCombate getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Combate";
    }
}