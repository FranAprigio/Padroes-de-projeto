package PadroesComportamentais.ChainOfResponsability;

public class TipoIntercorrenciaColetaSangue implements TipoDeIntercorrencia{

    private static TipoIntercorrenciaColetaSangue tipoIntercorrenciaColetaSangue = new TipoIntercorrenciaColetaSangue();

    private TipoIntercorrenciaColetaSangue() {};

    public static TipoIntercorrenciaColetaSangue getTipoIntercorrenciaColetaSangue() {
        return tipoIntercorrenciaColetaSangue;
    }
}
