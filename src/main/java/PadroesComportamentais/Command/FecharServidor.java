package PadroesComportamentais.Command;

public class FecharServidor implements Tarefa{

    private Servidor servidor;

    public FecharServidor(Servidor servidor) {
        this.servidor = servidor;
    }
    @Override
    public void executar() {
        this.servidor.abrirServidor();
    }

    @Override
    public void cancelar() {
        this.servidor.fecharServidor();
    }
}
