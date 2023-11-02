
package tp5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class ControlTren extends Thread{
    private Tren tren; 
    
    public ControlTren(String s, Tren t){
        this.setName(s);
        tren = t; 
    }
    
    public void run() {
        while(true){
            try {
                tren.empezarViaje();
            } catch (InterruptedException ex) {
                Logger.getLogger(ControlTren.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            
            System.out.println("EL TREN COMENZÓ EL VIAJE");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControlTren.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("---------------------------");
            System.out.println("EL TREN TERMINÓ EL VIAJE");
            
            tren.terminarViaje();
            try {
                tren.liberarTren();
            } catch (InterruptedException ex) {
                Logger.getLogger(ControlTren.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
