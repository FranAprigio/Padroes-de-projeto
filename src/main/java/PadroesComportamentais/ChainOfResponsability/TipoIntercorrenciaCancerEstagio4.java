package PadroesComportamentais.ChainOfResponsability;

public class TipoIntercorrenciaCancerEstagio4 implements TipoDeIntercorrencia{

    private static TipoIntercorrenciaCancerEstagio4 tipoIntercorrenciaCancerEstagio4 = new TipoIntercorrenciaCancerEstagio4();

    private TipoIntercorrenciaCancerEstagio4() {};

    public static TipoIntercorrenciaCancerEstagio4 getTipoIntercorrenciaCancerEstagio4() {
        return tipoIntercorrenciaCancerEstagio4;
    }
}
