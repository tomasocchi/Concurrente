package tp6.ej7;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlFerry extends Thread {
    private Ferry ferry;

    public ControlFerry(Ferry f) {
        ferry = f;
    }

    public void run() {
        while (true) {
            ferry.empezarViaje();

            try {
                Thread.sleep(1226);
            } catch (InterruptedException e) {
                Logger.getLogger(ControlFerry.class.getName()).log(Level.SEVERE, null, e);
            }

            ferry.terminarViaje();
            ferry.permitirAcceso();
        }
    }
}
