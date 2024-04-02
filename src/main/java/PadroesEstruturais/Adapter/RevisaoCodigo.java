package PadroesEstruturais.Adapter;

public class RevisaoCodigo implements IRevisao {

    private String codigo;
    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
