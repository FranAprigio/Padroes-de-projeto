package PadroesComportamentais.Mediator;

public class TicketSuporte {
    private static TicketSuporte instancia = new TicketSuporte();

    private TicketSuporte() {}

    public static TicketSuporte getInstancia() {
        return instancia;
    }

    public String receberReclamacaoBugInstanciaTicket(String mensagem) {
        return "O suporte agradece seu contato.\n"+
                "O administrador do servidor respondeu sua reclamacao conforme mensagem a seguir.\n" +
                ">>" + Administrador.getInstancia().receberReclamacaoBugInstancia(mensagem);
    }

    public String receberReclamacaoBugPVPTicket(String mensagem) {
        return "O suporte agradece seu contato.\n"+
                "O administrador do servidor respondeu sua reclamacao conforme mensagem a seguir.\n" +
                ">>" + Administrador.getInstancia().receberReclamacaoBugPVP(mensagem);
    }

    public String receberSugestaoDeMelhoriaTicket(String mensagem) {
        return "O suporte agradece seu contato.\n"+
                "O administrador respondeu sua sugestao conforme mensagem a seguir.\n" +
                ">>" + Administrador.getInstancia().receberSugestaoDeMelhoria(mensagem);
    }
}
