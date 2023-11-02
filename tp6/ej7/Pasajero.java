
package tp6.ej7;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Pasajero extends Thread {

    private Ferry ferry;

    public Pasajero(Ferry f, String s) {
        ferry = f;
        this.setName(s);
    }

    public void run() {
        // Pasajero intenta ingresar al ferry
        ferry.ingresar();

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Pasajero.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Pasajero se baja del ferry
        ferry.bajarse();
    }
}
