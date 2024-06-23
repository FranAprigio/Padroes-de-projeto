package PadroesComportamentais.Memento;

public class JogadorEstadoDescansado implements JogadorEstado{
    private JogadorEstadoDescansado() {};
    private static JogadorEstadoDescansado instance = new JogadorEstadoDescansado();
    public static JogadorEstadoDescansado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Descansado";
    }
}
