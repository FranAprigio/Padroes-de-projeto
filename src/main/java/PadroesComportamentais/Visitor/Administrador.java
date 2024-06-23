package PadroesComportamentais.Visitor;

public class Administrador implements Pessoa{

    private int codigoId;
    private String nome;
    private String permissaoParaBanir;

    public Administrador(int codigoId, String nome, String permissaoParaBanir) {
        this.codigoId = codigoId;
        this.nome = nome;
        this.permissaoParaBanir = permissaoParaBanir;
    }

    public int getCodigoId() {
        return codigoId;
    }

    public String getNome() {
        return nome;
    }

    public String getPermissao() {
        return permissaoParaBanir;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAdministrador(this);
    }
}
