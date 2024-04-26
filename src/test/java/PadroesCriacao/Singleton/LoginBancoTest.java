package PadroesCriacao.Singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginBancoTest {

    @Test
    void deveRetornarServidor() {
        LoginBanco loginBanco = LoginBanco.getInstance();
        loginBanco.setServidor("192.168.1.101");
        assertEquals("192.168.1.101", loginBanco.getInstance().getServidor());
    }

    @Test
    void deveRetornarLogin() {
        LoginBanco loginBanco = LoginBanco.getInstance();
        loginBanco.setLogin("usuario");
        assertEquals("usuario", loginBanco.getLogin());
    }

    @Test
    void deveRetornarSenha() {
        LoginBanco loginBanco = LoginBanco.getInstance();
        loginBanco.setSenha("senha123");
        assertEquals("senha123", loginBanco.getSenha());
    }

    @Test
    void deveRetornarNomeBanco() {
        LoginBanco loginBanco = LoginBanco.getInstance();
        loginBanco.setNomeBanco("meu_banco");
        assertEquals("meu_banco", loginBanco.getNomeBanco());
    }

    @Test
    void deveConfigurarLogin() {
        LoginBanco loginBanco = LoginBanco.getInstance();
        loginBanco.setLogin("novo_usuario");
        assertEquals("novo_usuario", loginBanco.getLogin());
    }

    @Test
    void deveConfigurarSenha() {
        LoginBanco loginBanco = LoginBanco.getInstance();
        loginBanco.setSenha("nova_senha123");
        assertEquals("nova_senha123", loginBanco.getSenha());
    }

    @Test
    void deveConfigurarNomeBanco() {
        LoginBanco loginBanco = LoginBanco.getInstance();
        loginBanco.setNomeBanco("novo_banco");
        assertEquals("novo_banco", loginBanco.getNomeBanco());
    }
}
