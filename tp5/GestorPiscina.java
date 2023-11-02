package tp5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class GestorPiscina extends Thread {

    private Piscina p;

    public GestorPiscina(Piscina unaPiscina) {
        p = unaPiscina;
    }

    public void run() {
        while (true) {
            try {
                p.dejarEntrar();
            } catch (InterruptedException ex) {
                Logger.getLogger(GestorPiscina.class.getName()).log(Level.SEVERE, null, ex);
            }

            p.controlarEntrada();
        }
    }
}
