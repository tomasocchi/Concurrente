package tp6.ej4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread {

    private Almacen a;

    public Productor(Almacen al) {
        a = al;
    }

    public void run() {
        a.recargar();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        a.terminar();
    }
}
