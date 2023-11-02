
package tp6.ej6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class Productor extends Thread {

    private Almacen a;

    public Productor(Almacen al) {
        a = al;
    }

    public void run() {

        a.recargar();

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
