package PadroesComportamentais.Memento;

public class JogadorEstadoAtivo implements JogadorEstado{
    private JogadorEstadoAtivo() {};
    private static JogadorEstadoAtivo instance = new JogadorEstadoAtivo();
    public static JogadorEstadoAtivo getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ativo";
    }
}
