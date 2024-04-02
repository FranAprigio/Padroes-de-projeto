package PadroesEstruturais.Adapter;

public class CodigoAdapter extends RevisaoLetra{

    private IRevisao revisaoCodigo;
    public CodigoAdapter(IRevisao revisaoCodigo){
        this.revisaoCodigo = revisaoCodigo;
    }

    public String recuperarCodigo() {
        if (this.getCodigo() == ".-")
            revisaoCodigo.setCodigo("A");
        else
        if (this.getCodigo() == "-...")
            revisaoCodigo.setCodigo("B");
        else
        if (this.getCodigo() == "-.-.")
            revisaoCodigo.setCodigo("C");
        else
        if (this.getCodigo() == "-..")
            revisaoCodigo.setCodigo("D");
        return revisaoCodigo.getCodigo();
    }

    public void salvarRevisao() {
        if (revisaoLetra.getLetra().equals("A"))
            this.setLetra("F");
        else if (revisaoLetra.getLetra().equals("B"))
            this.setLetra("G");
        else if (revisaoLetra.getLetra().equals("C"))
            this.setLetra("H");
        else
            this.setLetra("I");
    }
}
