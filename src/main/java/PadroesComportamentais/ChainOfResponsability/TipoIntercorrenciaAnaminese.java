package PadroesComportamentais.ChainOfResponsability;

public class TipoIntercorrenciaAnaminese implements TipoDeIntercorrencia{

    private static TipoIntercorrenciaAnaminese tipoIntercorrenciaAnaminese = new TipoIntercorrenciaAnaminese();

    private TipoIntercorrenciaAnaminese() {};

    public static TipoIntercorrenciaAnaminese getTipoIntercorrenciaAnaminese() {
        return tipoIntercorrenciaAnaminese;
    }
}
