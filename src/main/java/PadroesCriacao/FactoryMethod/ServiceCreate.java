package PadroesCriacao.FactoryMethod;

public class ServiceCreate implements  IService{
    public String executar() {
        return "Linha criada";
    }

    public String cancelar() {
        return "Operacao de cancelar criaçãp da linha";
    }
}
