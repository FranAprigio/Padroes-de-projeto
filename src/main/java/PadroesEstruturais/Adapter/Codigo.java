package PadroesEstruturais.Adapter;

public class Codigo {
    IRevisao revisao;
    CodigoAdapter codigoAdapter;

    public Codigo() {
        revisao = new RevisaoCodigo();
        codigoAdapter = new CodigoAdapter(revisao);
    }

    public void setRevisao(String conceito) {
        revisao.setCodigo(conceito);
        codigoAdapter.salvarRevisao();
    }

    public String getRevisao() {
        return codigoAdapter.recuperarCodigo();
    }

    public String getLetra() {
        return codigoAdapter.getLetra();
    }
}

