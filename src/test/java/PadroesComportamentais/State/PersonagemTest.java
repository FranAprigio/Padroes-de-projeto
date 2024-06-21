package PadroesComportamentais.State;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {

    Personagem personagem;

    @BeforeEach
    public void setUp() {
        personagem = new Personagem();
    }

    @Test
    public void deveCombaterPersonagemVivo() {
        personagem.setEstado(PersonagemEstadoVivo.getInstance());
        assertTrue(personagem.Combater());
        assertEquals(PersonagemEstadoCombate.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveContinuarVivoPersonagemEmCombate() {
        personagem.setEstado(PersonagemEstadoCombate.getInstance());
        assertTrue(personagem.Vivo());
        assertEquals(PersonagemEstadoVivo.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveMorrerPersonagemEmCombate() {
        personagem.setEstado(PersonagemEstadoCombate.getInstance());
        assertTrue(personagem.Morrer());
        assertEquals(PersonagemEstadoMorto.getInstance(), personagem.getEstado());
    }

    @Test
    public void naoDeveFicarVivoPersonagemVivoForaDeCombate() {
        personagem.setEstado(PersonagemEstadoVivo.getInstance());
        assertFalse(personagem.Vivo());
    }

    @Test
    public void naoDeveFicarVivoPersonagemMorto() {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        assertFalse(personagem.Vivo());
    }

    @Test
    public void naoDeveFicarEmCombatePersonagemEmCombate() {
        personagem.setEstado(PersonagemEstadoCombate.getInstance());
        assertFalse(personagem.Combater());
    }

    @Test
    public void naoDeveFicarEmCombatePersonagemMorto() {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        assertFalse(personagem.Combater());
    }

    @Test
    public void naoDeveFicarMortoPersonagemMorto() {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        assertFalse(personagem.Morrer());
    }

    @Test
    public void naoDeveViverPersonagemMorto() {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        assertFalse(personagem.Vivo());
    }

    @Test
    public void naoDeveCombaterPersonagemMorto() {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        assertFalse(personagem.Combater());
    }

    @Test
    public void deveRetornarNomeEstadoVivo() {
        personagem.setEstado(PersonagemEstadoVivo.getInstance());
        assertEquals("Vivo", personagem.getNomeEstado());
    }

    @Test
    public void deveRetornarNomeEstadoCombate() {
        personagem.setEstado(PersonagemEstadoCombate.getInstance());
        assertEquals("Combate", personagem.getNomeEstado());
    }

    @Test
    public void deveRetornarNomeEstadoMorto() {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        assertEquals("Morto", personagem.getNomeEstado());
    }

    @Test
    public void deveAlterarNomePersonagem() {
        personagem.setNome("Heroi");
        assertEquals("Heroi", personagem.getNome());
    }

    @Test
    public void deveInicializarPersonagemVivo() {
        assertEquals(PersonagemEstadoVivo.getInstance(), personagem.getEstado());
    }
}
