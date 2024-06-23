package PadroesComportamentais.ChainOfResponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaIntercorrencia = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String tratarIntercorrencia(Intercorrencia intercorrencia) {
        if (listaIntercorrencia.contains(intercorrencia.getTipoDeIntercorrencia())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.tratarIntercorrencia(intercorrencia);
            }
            else
            {
                return "Sem tratamento";
            }
        }
    }
}
