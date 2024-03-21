package PadroesCriacao.Builder;

public class Funcionario {
    private int codigoFuncionario;
    private String NomeCompleto;
    private String CPF;
    private Float Salario;
    private String Email;

    public Funcionario(){
        this.codigoFuncionario = 0;
        this.NomeCompleto = "";
        this.CPF = "";
        this.Salario = (float) 0;
        this.Email = "";
    }

    public int getcodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Float getSalario() {
        return Salario;
    }

    public void setSalario(Float salario) {
        Salario = salario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
