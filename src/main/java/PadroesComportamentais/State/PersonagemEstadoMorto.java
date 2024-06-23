package PadroesComportamentais.State;

public class PersonagemEstadoMorto extends PersonagemEstado{

    private static PersonagemEstadoMorto instance = new PersonagemEstadoMorto();
    public static PersonagemEstadoMorto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Morto";
    }
}
