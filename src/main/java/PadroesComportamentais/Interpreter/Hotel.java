package PadroesComportamentais.Interpreter;

public class Hotel {

    public static String formula = "diaria * tempo + taxaInicial";

    public static Double calcularEstadia(Hospede hospede){

        Double diaria = (hospede.getQuarto() / 10) * 1.0;
        Double taxaInicial = 5.0 * diaria;
        String expressao;

        expressao = formula.replace("diaria", Double.toString(diaria));
        expressao = expressao.replace("tempo", Double.toString(hospede.getTempo()));
        expressao = expressao.replace("taxaInicial", Double.toString(taxaInicial));

        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);

        return interpretador.interpretar();
    }
}
