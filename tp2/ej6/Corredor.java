
package tp2.ej6;
import java.util.Random; 
import java.util.logging.Level;
import java.util.logging.Logger; 

public class Corredor implements Runnable {
    String nombre; 
    int distancia;  
    
    public Corredor(String n){
        this.nombre = n; 
        this.distancia = 0; 
    }
    
    public void run() {
        int i = 0; 
        int total = 100; 
        int ganador = 0; 
        
        while(i < 100){
          Random aux = new Random(); 
          int paso = aux.nextInt(10) + 1; 
          
          try {
              Thread.sleep(30);             
              }catch (InterruptedException ex){
                  Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);                  
              }
              distancia = distancia + paso; 
              i = i +1;  
        }
        
        System.out.println("Termino de correr: "+this.nombre+" con una distancia de: "+this.distancia+" kms hechos");
    }
}
