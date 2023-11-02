/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomas
 */
public class Empleado extends Thread{
    private Confiteria conf; 
    
    public Empleado(Confiteria c){
        conf = c; 
    }
    
    public void run(){
        try {
            conf.solicitarComer();
        } catch (InterruptedException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println("El empleado "+Thread.currentThread().getName()+" esta esperando el bajon");
            conf.sentarse();
        } catch (InterruptedException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            System.out.println("El empleado "+Thread.currentThread().getName()+" esta comiendo");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El empleado "+Thread.currentThread().getName()+" termino de comer");
        conf.irse();
        
    }
    
    
           
}
