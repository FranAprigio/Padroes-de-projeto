package PadroesEstruturais.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightClasseFactory {

    private static Map<String, Classe> classes = new HashMap<>();

    public static Classe getClasse(String nome, String funcao) {
        Classe classe = classes.get(nome);
        if (classe == null) {
            classe = new Classe(nome, funcao);
            classes.put(nome, classe);
        }
        return classe;
    }

    public static int getTotalClasses() {
        return classes.size();
    }
}