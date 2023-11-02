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
public class Cocinero extends Thread{
    private Confiteria confi;
    
    public Cocinero(Confiteria c){
        confi = c; 
    }
    
    public void run(){
        while(true){
            try {
                confi.servirComida();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cocinero.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            confi.entregarComida();
        }
    }
}
