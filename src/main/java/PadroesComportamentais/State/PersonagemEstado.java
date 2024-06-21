package PadroesComportamentais.State;

public abstract class PersonagemEstado {

    public abstract String getEstado();

    public boolean Vivo(Personagem personagem) {
        return false;
    }

    public boolean Combater(Personagem personagem) {
        return false;
    }

    public boolean Morrer(Personagem personagem) {
        return false;
    }
}
