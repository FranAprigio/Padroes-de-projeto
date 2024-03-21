package PadroesCriacao.FactoryMethod;

public class ServiceDelete implements  IService{
    public String executar() {
        return "Linha Excluida";
    }

    public String cancelar() {
        return "Operacao de cancelar eclusão da linha";
    }
}
