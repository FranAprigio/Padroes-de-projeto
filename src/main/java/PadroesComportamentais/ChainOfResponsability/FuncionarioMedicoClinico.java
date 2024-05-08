package PadroesComportamentais.ChainOfResponsability;

public class FuncionarioMedicoClinico extends Funcionario{

    public FuncionarioMedicoClinico(Funcionario superior) {
        listaIntercorrencia.add(TipoIntercorrenciaAnaminese.getTipoIntercorrenciaAnaminese());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Médico clinico";
    }
}
