package PadroesComportamentais.Command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdministradorTest {

    Administrador administrador;
    Servidor servidor;

    @BeforeEach
    void setUp() {
        administrador = new Administrador();
        servidor = new Servidor (220.00f) ;
    }

    @Test
    void deveAbrirSemestre() {
        Tarefa aberturaDoServidor = new AbrirServidor(servidor);
        administrador.executarTarefa(aberturaDoServidor);

        assertEquals("Servidor aberto", servidor.getSituacao());
    }

    @Test
    void deveFecharServidor() {
        Tarefa fechamentoDoServidor = new FecharServidor(servidor);
        administrador.executarTarefa(fechamentoDoServidor);

        assertEquals("Servidor aberto", servidor.getSituacao());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Tarefa aberturaDoServidor = new AbrirServidor(servidor);
        Tarefa fechamentoDoServidor = new FecharServidor(servidor);

        administrador.executarTarefa(aberturaDoServidor);
        administrador.executarTarefa(fechamentoDoServidor);

        administrador.cancelarUltimaTarefa();

        assertEquals("Servidor fechado", servidor.getSituacao());
    }

    @Test
    void deveCancelarTarefaQuandoNaoHaTarefaParaCancelar() {
        Administrador administrador = new Administrador();
        assertDoesNotThrow(() -> administrador.cancelarUltimaTarefa());
    }

    @Test
    void deveAbrirEDepoisFecharServidor() {
        Administrador administrador = new Administrador();
        Servidor servidor = new Servidor(220.00f);

        Tarefa aberturaDoServidor = new AbrirServidor(servidor);
        Tarefa fechamentoDoServidor = new FecharServidor(servidor);

        administrador.executarTarefa(aberturaDoServidor);
        administrador.executarTarefa(fechamentoDoServidor);

        assertEquals("Servidor aberto", servidor.getSituacao());
    }

    @Test
    void deveCancelarAberturaEDeixarServidorFechado() {
        Administrador administrador = new Administrador();
        Servidor servidor = new Servidor(220.00f);

        Tarefa aberturaDoServidor = new AbrirServidor(servidor);
        Tarefa fechamentoDoServidor = new FecharServidor(servidor);

        administrador.executarTarefa(aberturaDoServidor);
        administrador.cancelarUltimaTarefa();

        assertEquals("Servidor fechado", servidor.getSituacao());
    }

    @Test
    void deveCancelarFechamentoEDeixarServidorAberto() {
        Administrador administrador = new Administrador();
        Servidor servidor = new Servidor(220.00f);

        Tarefa aberturaDoServidor = new AbrirServidor(servidor);
        Tarefa fechamentoDoServidor = new FecharServidor(servidor);

        administrador.executarTarefa(aberturaDoServidor);
        administrador.executarTarefa(fechamentoDoServidor);
        administrador.cancelarUltimaTarefa();

        assertEquals("Servidor fechado", servidor.getSituacao());
    }
}
