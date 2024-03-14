package PadroesEstruturais.Adapter;

public class Codigo {
    IRevisao revisao;
    RevisaoLetra revisaoL;
    CodigoAdapter codigoAdapter;

    public Codigo() {
        revisao = new RevisaoCodigo();
        revisaoL = new RevisaoLetra();
        codigoAdapter = new CodigoAdapter(revisao, revisaoL);
    }

    public void setRevisao(String conceito) {
        revisao.setCodigo(conceito);
        revisaoL.setLetra(conceito);
        codigoAdapter.salvarRevisao();
    }

    public String getRevisao() {
        return codigoAdapter.recuperarCodigo();
    }

    public String getLetra() {
        return codigoAdapter.getLetra();
    }
}

