package PadroesCriacao.AbstractFactory;

import PadroesCriacao.AbstractFatory.FabricaAbstrata;
import PadroesCriacao.AbstractFatory.FabricaEstagiario;
import PadroesCriacao.AbstractFatory.FabricaSenior;
import PadroesCriacao.AbstractFatory.Funcionario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteTarefas {
    @Test
    public void deveEmitirHistoricoDeTarefasEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Histórico de tarefas de estagiario", funcionario.emitirHistoricoDeTarefas());
    }
    @Test
    public void deveEmitirHistoricoDeTarefasSenior() {
        FabricaAbstrata fabrica = new FabricaSenior();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Histórico de tarefas de senior", funcionario.emitirHistoricoDeTarefas());
    }

    @Test
    public void deveEmitirTarefasEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Tarefas do Estagiario", funcionario.emitirTarefas());
    }

    @Test
    public void deveEmitirTarefasSenior() {
        FabricaAbstrata fabrica = new FabricaSenior();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Tarefas do Senior", funcionario.emitirTarefas());
    }
}
