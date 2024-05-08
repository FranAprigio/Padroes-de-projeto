package PadroesComportamentais.ChainOfResponsability;

public class FuncionarioCirurgiao extends Funcionario{

    public FuncionarioCirurgiao(Funcionario superior) {
        listaIntercorrencia.add(TipoIntercorrenciaCirurgia.getTipoIntercorrenciaCirurgia());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Cirurgião";
    }
}
