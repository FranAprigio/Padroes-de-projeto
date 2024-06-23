package PadroesComportamentais.Mediator;

public class Administrador implements Departamento{
    private static Administrador instancia = new Administrador();

    private Administrador() {}

    public static Administrador getInstancia() {
        return instancia;
    }

    public String receberReclamacaoBugInstancia(String mensagem) {
        return "Estaremos trabalhando para corrigir este bug: " + mensagem;
    }

    public String receberReclamacaoBugPVP(String mensagem) {
        return "Estaremos verificando este bug agora mesmo: " + mensagem;
    }

    public String receberSugestaoDeMelhoria(String mensagem) {
        return "Iremos analisar sua sugestão: " + mensagem;
    }
}
