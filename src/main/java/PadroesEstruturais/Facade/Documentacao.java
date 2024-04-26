package PadroesEstruturais.Facade;

public class Documentacao extends Setor{
    private static Documentacao documentacao = new Documentacao();

    private Documentacao() {};

    public static Documentacao getInstancia() {
        return documentacao;
    }
}
