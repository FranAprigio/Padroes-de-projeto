package PadroesComportamentais.ChainOfResponsability;

public class FuncionarioEnfermeiro extends Funcionario{

    public FuncionarioEnfermeiro(Funcionario superior) {
        listaIntercorrencia.add(TipoIntercorrenciaColetaSangue.getTipoIntercorrenciaColetaSangue());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Enfermeiro";
    }
}
