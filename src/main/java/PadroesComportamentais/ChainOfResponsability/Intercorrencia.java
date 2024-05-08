package PadroesComportamentais.ChainOfResponsability;

public class Intercorrencia {
    private TipoDeIntercorrencia tipoDeIntercorrencia;

    public Intercorrencia(TipoDeIntercorrencia tipoDeIntercorrencia) {
        this.tipoDeIntercorrencia = tipoDeIntercorrencia;
    }

    public TipoDeIntercorrencia getTipoDeIntercorrencia() {
        return tipoDeIntercorrencia;
    }

    public void setTipoDeIntercorrencia(TipoDeIntercorrencia tipoDeIntercorrencia) {
        this.tipoDeIntercorrencia = tipoDeIntercorrencia;
    }
}
