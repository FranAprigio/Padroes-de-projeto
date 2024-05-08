package PadroesComportamentais.ChainOfResponsability;

public class TipoIntercorrenciaCirurgia implements TipoDeIntercorrencia{

    private static TipoIntercorrenciaCirurgia tipoIntercorrenciaCirurgia = new TipoIntercorrenciaCirurgia();

    private TipoIntercorrenciaCirurgia() {};

    public static TipoIntercorrenciaCirurgia getTipoIntercorrenciaCirurgia() {
        return tipoIntercorrenciaCirurgia;
    }
}
