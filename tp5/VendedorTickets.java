
package tp5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class VendedorTickets extends Thread{
    private Tren tren; 
    
    public VendedorTickets(String n, Tren t){
        this.setName(n);
        tren = t; 
    }
    
    public void run() {
        while(true){
            try {
                tren.venderTicket();
            } catch (InterruptedException ex) {
                Logger.getLogger(VendedorTickets.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
