package tp6.ej7;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Auto extends Thread{
    private Ferry ferry; 
    
    public Auto(Ferry f, String s){
        ferry = f; 
        this.setName(s);
    }

    public void run(){
        ferry.subirse();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, e);
        }

        ferry.bajarse();
    }
}
