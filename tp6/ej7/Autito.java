
package tp6.ej7;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Autito extends Thread {

    private Ferry ferry;

    public Autito(Ferry f, String n) {
        ferry = f;
        this.setName(n);
    }

    public void run() {
        // Auto desea ingresar al ferry
        ferry.ingresar();

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Autito.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Auto se baja del Ferry
        ferry.bajarse();
    }

}
