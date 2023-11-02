
package tp6.ej2;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Estudiante extends Thread{
    private SalaEstudio sala;
    
    public Estudiante(SalaEstudio s){
        sala = s; 
    }
    
    public void run(){
        sala.sentarse();
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sala.irse();
        } catch (InterruptedException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
}
