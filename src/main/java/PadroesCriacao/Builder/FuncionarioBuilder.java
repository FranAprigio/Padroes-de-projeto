package PadroesCriacao.Builder;

public class FuncionarioBuilder {

    private Funcionario funcionario;
    public FuncionarioBuilder() {
        funcionario = new Funcionario();
    }

    public Funcionario build() {
        if (funcionario.getcodigoFuncionario() == 0) {
            throw new IllegalArgumentException("Codigo inválido");
        }
        if (funcionario.getNomeCompleto().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (funcionario.getCPF().isEmpty()) {
            throw new IllegalArgumentException("CPF inválido");
        }
        if (funcionario.getSalario() == 0) {
            throw new IllegalArgumentException("Salario inválido");
        }
        if (funcionario.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email inválido");
        }
        return funcionario;
    }

    public FuncionarioBuilder setCodigoFuncionario(int codigoFuncionario) {
        funcionario.setCodigoFuncionario(codigoFuncionario);
        return this;
    }

    public FuncionarioBuilder setNomeCompleto(String nomeCompleto) {
        funcionario.setNomeCompleto(nomeCompleto);
        return this;
    }

    public FuncionarioBuilder setCPF(String CPF) {
        funcionario.setCPF(CPF);
        return this;
    }

    public FuncionarioBuilder setSalario(Float Salario) {
        funcionario.setSalario(Salario);
        return this;
    }

    public FuncionarioBuilder setEmail(String Email) {
        funcionario.setEmail(Email);
        return this;
    }
}
