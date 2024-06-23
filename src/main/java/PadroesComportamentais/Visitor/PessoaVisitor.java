package PadroesComportamentais.Visitor;

public class PessoaVisitor implements Visitor{

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirJogador(Jogador jogador) {
        return "Jogador{" +
                "batleNetId=" + jogador.getBatleNetId() +
                ", nome='" + jogador.getNome() + '\'' +
                ", jogo=" + jogador.getNomeJogo() +
                '}';
    }

    @Override
    public String exibirAdministrador(Administrador administrador) {
        return "Administrador{" +
                "codigoId=" + administrador.getCodigoId() +
                ", nome='" + administrador.getNome() + '\'' +
                ", permissão para banir='" + administrador.getPermissao() + '\'' +
                '}';
    }
}
