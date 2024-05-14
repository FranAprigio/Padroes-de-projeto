package PadroesComportamentais.Command;

public class AbrirServidor implements Tarefa{

    private Servidor servidor;

    public AbrirServidor(Servidor servidor) {
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
