package tp6.ej7;

import java.util.logging.Level;
import java.util.logging.Logger;


// Hilo control del ferry
public class ControlFerry extends Thread {

    private Ferry ferry;

    public ControlFerry(Ferry f) {
        ferry = f;
    }

    public void run() {
        while (true) {
            ferry.empezarViaje();

            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControlFerry.class.getName()).log(Level.SEVERE, null, ex);
            }

            ferry.terminarViaje();

            ferry.permitirAcceso();
        }
    }
}
