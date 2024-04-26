package PadroesEstruturais.Facade;

public class Cliente {

    public boolean retirarCarro() {
        return ClienteFacade.verificarPendenciasRetiradaCarro(this);
    }
}
