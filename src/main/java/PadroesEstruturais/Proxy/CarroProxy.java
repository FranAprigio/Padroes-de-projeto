package PadroesEstruturais.Proxy;

import java.util.List;

public class CarroProxy implements ICarro{

    private Carro carro;

    private Integer renavan;

    public CarroProxy(Integer renavan) {
        this.renavan = renavan;
    }

    @Override
    public List<String> obterDadosVeiculo() {
        if (this.carro == null) {
            this.carro = new Carro(this.renavan);
        }
        return this.carro.obterDadosVeiculo();
    }

    @Override
    public List<Integer> obterAnoPotencia(Atendente atendente) {
        if (!atendente.isAdministrador()) {
            throw new IllegalArgumentException("Atendente não autorizado");
        }
        if (this.carro == null) {
            this.carro = new Carro(this.renavan);
        }
        return this.carro.obterAnoPotencia(atendente);
    }
}
