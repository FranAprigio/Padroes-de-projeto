package PadroesEstruturais.Proxy;

import java.util.Arrays;
import java.util.List;

public class Carro implements ICarro{

    private Integer renavan;
    private String nome;
    private String marca;
    private String chassi;
    private Integer ano;
    private Integer potencia;

    public Carro(int renavan) {
        this.renavan = renavan;
        Carro objeto = BD.getCarro(renavan);
        this.nome = objeto.nome;
        this.marca = objeto.marca;
        this.chassi = objeto.chassi;
        this.ano = objeto.ano;
        this.potencia = objeto.potencia;

    }

    public Carro(Integer renavan, String nome, String marca, String chassi, Integer ano, Integer potencia) {
        this.renavan = renavan;
        this.nome = nome;
        this.marca = marca;
        this.chassi = chassi;
        this.ano = ano;
        this.potencia = potencia;
    }

    public Integer getRenavan() {
        return renavan;
    }

    @Override
    public List<String> obterDadosVeiculo() {
        return Arrays.asList(this.nome, this.marca, this.chassi);
    }

    @Override
    public List<Integer> obterAnoPotencia(Atendente atendente) {
        return Arrays.asList(this.ano, this.potencia);
    }
}
