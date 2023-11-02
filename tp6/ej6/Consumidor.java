
package tp6.ej6;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Consumidor extends Thread {

    private Almacen a;

    public Consumidor(Almacen al) {
        a = al;
    }

    public void run() {

        a.sacar();
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
