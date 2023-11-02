
package tp5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class Pasajero extends Thread{
    private Tren tren; 
    
    public Pasajero(String nombre, Tren t){
        tren = t; 
        this.setName(nombre);
    }
    
    public void run(){
        try {
            tren.comprarTicket();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pasajero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            tren.subirAlTren();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pasajero.class.getName()).log(Level.SEVERE, null, ex);
        }
                System.out.println("----El cliente " + Thread.currentThread().getName() + " se subio al tren ----");

        try {
            tren.sentarse();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pasajero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            tren.bajarse();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pasajero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
