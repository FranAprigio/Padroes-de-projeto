package PadroesCriacao.AbstractFatory;

public class FabricaEstagiario implements FabricaAbstrata{
    @Override
    public Tarefas createTarefas() {
        return new TarefasEstagiario();
    }

    @Override
    public HistoricoDeTarefas createHistoricoDeTarefas() {
        return new HistoricoDeTarefasEstagiario();
    }
}
