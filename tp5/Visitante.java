/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class Visitante extends Thread{
    private Mirador mirador; 
    
    public Visitante(Mirador m, String nombre){
        mirador = m; 
        this.setName(nombre);
    }
    
    public void run(){
        
        try {
            mirador.subirseMirador();
        } catch (InterruptedException ex) {
            Logger.getLogger(Visitante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Visitante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            mirador.Solicitartirarse();
        } catch (InterruptedException ex) {
            Logger.getLogger(Visitante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         System.out.println("El visitante "+Thread.currentThread().getName()+" se esta bajando por el tobogan");
          try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Visitante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        mirador.bajar();
        System.out.println("El visitante "+Thread.currentThread().getName()+" se bajo del tobogan");

    }
}
