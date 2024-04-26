package PadroesEstruturais.Proxy;

import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<Integer, Carro> carros = new HashMap<>();

    public static Carro getCarro(Integer renavan) {
        return carros.get(renavan);
    }

    public static void addCarro(Carro carro) {
        carros.put(carro.getRenavan(), carro);
    }
}