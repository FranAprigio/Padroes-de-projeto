package PadroesComportamentais.Iterator;

import java.util.Iterator;

public class Regiao {

    public static Integer contarUsuariosBanidosServidor(Servidor servidor) {
        int quantidade = 0;
        for (Usuario usuario : servidor) {
            if (usuario.estaBinido()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalUsuariosBanidos(Servidor servidor) {
        int quantidade = 0;
        for (Iterator a = servidor.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}