package tp6.ej7;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Pasajero extends Thread{
    private Ferry ferry; 

    public Pasajero(Ferry f, String s){
        ferry = f; 
        this.setName(s);
    }

    public void run(){
        ferry.subirse();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Logger.getLogger(Pasajero.class.getName()).log(Level.SEVERE, null, e);

        }

        ferry.bajarse();
    }
}

