
package tp4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class Mozo extends Thread{
    private Confiteria conf;
    
    public Mozo(Confiteria c){
        conf = c; 
    }
    
    public void run(){
        while(true){
            try {
                conf.esperarCliente();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mozo.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("El mozo le prepara el bajon al verga del empleado");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mozo.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("El mozo termino de preparar el bajon");   
            conf.prepararMesa();
        }
    }
}
