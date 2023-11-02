/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class Jaula implements Runnable{ 
    private Descansar d = new Descansar(); 
    private RuedaDeJugar r = new RuedaDeJugar(); 
    private Comer c = new Comer(); 
    public void run() {
        try {
            d.descansar();
            r.jugarRueda();
            c.comer();
            
        }catch(InterruptedException ex){
            Logger.getLogger(Jaula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
