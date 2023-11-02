
package tp5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class Mozo extends Thread{
    private Confiteria confi; 
    
    public Mozo(Confiteria c){
        confi = c; 
    }
    
    public void run(){
        while(true){
            try {
                confi.servirBebida();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mozo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            confi.entregarBebida();
        }
    }
}
