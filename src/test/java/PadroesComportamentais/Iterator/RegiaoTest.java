package PadroesComportamentais.Iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegiaoTest {

    @Test
    void deveContarUsuariosBanidosServidor() {
        Servidor servidor = new Servidor(
                new Usuario("Marco", true),
                new Usuario("Antonio", true),
                new Usuario("Jose", false),
                new Usuario("Maria", true)
        );
        assertEquals(3, Regiao.contarUsuariosBanidosServidor(servidor));
    }

    @Test
    void deveContarTotalUsuariosServidor() {
        Servidor servidor = new Servidor(
                new Usuario("Marco", true),
                new Usuario("Antonio", true),
                new Usuario("Jose", false),
                new Usuario("Maria", true)
        );
        assertEquals(4, Regiao.contarTotalUsuariosBanidos(servidor));
    }

    @Test
    void deveContarUsuariosBanidosServidor_0Banidos() {
        Servidor servidor = new Servidor(
                new Usuario("Marco", false),
                new Usuario("Antonio", false),
                new Usuario("Jose", false),
                new Usuario("Maria", false)
        );
        assertEquals(0, Regiao.contarUsuariosBanidosServidor(servidor));
    }

    @Test
    void deveContarTotalUsuariosServidor_Vazio() {
        Servidor servidor = new Servidor();
        assertEquals(0, Regiao.contarTotalUsuariosBanidos(servidor));
    }

    @Test
    void deveValidarNomeUsuarios() {
        Usuario usuario = new Usuario("Carlos", true);
        assertEquals("Carlos", usuario.getNome());

        usuario.setNome("Roberto");
        assertEquals("Roberto", usuario.getNome());
    }
}
