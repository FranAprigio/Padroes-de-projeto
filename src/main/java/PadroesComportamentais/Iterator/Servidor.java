package PadroesComportamentais.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Servidor implements Iterable<Usuario> {
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public Servidor(Usuario... alunos) {
        this.usuarios = Arrays.asList(alunos);
    }

    @Override
    public Iterator<Usuario> iterator() {
        return usuarios.iterator();
    }
}
