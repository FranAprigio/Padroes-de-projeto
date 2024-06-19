package PadroesComportamentais.Mediator;

public interface Departamento {

    String receberReclamacaoBugInstancia(String mensagem);
    String receberReclamacaoBugPVP(String mensagem);
    String receberSugestaoDeMelhoria(String mensagem);
}
