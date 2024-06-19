package PadroesComportamentais.Mediator;

public class Pessoa {

    public String reclamarBugInstanciaTicket(String mensagem) {
        return TicketSuporte.getInstancia().receberReclamacaoBugInstanciaTicket(mensagem);
    }

    public String reclamarBugPVPTicket(String mensagem) {
        return TicketSuporte.getInstancia().receberReclamacaoBugPVPTicket(mensagem);
    }

    public String segustaoDeMelhoriaTicket(String mensagem) {
        return TicketSuporte.getInstancia().receberSugestaoDeMelhoriaTicket(mensagem);
    }
}
