package PadroesComportamentais.State;

public class PersonagemEstadoCombate extends PersonagemEstado{

    private PersonagemEstadoCombate() {};

    private static PersonagemEstadoCombate instance = new PersonagemEstadoCombate();
    public static PersonagemEstadoCombate getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Combate";
    }

    public boolean Vivo(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoVivo.getInstance());
        return true;
    }

    public boolean Morrer(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        return true;
    }
}
