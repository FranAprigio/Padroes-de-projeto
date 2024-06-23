package PadroesComportamentais.State;

public class PersonagemEstadoVivo extends PersonagemEstado{

    private PersonagemEstadoVivo() {};
    private static PersonagemEstadoVivo instance = new PersonagemEstadoVivo();
    public static PersonagemEstadoVivo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Vivo";
    }

    public boolean Combater(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoCombate.getInstance());
        return true;
    }
}
