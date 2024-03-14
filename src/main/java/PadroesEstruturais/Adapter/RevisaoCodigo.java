package PadroesEstruturais.Adapter;

public class RevisaoCodigo implements IRevisao {

    private String codigo;
    private String letra;
    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
