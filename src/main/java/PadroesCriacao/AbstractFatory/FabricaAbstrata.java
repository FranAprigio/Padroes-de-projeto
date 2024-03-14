package PadroesCriacao.AbstractFatory;

public interface FabricaAbstrata {
    Tarefas createTarefas();
    HistoricoDeTarefas createHistoricoDeTarefas();
}
