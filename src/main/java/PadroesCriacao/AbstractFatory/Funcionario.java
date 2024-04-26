package PadroesCriacao.AbstractFatory;

public class Funcionario {
    private Tarefas tarefas;
    private HistoricoDeTarefas historicoDeTarefas;

    public Funcionario (FabricaAbstrata fabrica) {
        this.tarefas = fabrica.createTarefas();
        this.historicoDeTarefas = fabrica.createHistoricoDeTarefas();
    }

    public String emitirTarefas() {
        return this.tarefas.emitir();
    }

    public String emitirHistoricoDeTarefas() {
        return this.historicoDeTarefas.emitir();
    }
}
