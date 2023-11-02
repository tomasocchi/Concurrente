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
public class main7{
    public static void main(String[] args){
        Cadena c = new Cadena(); 
        Imprimir hilo1 = new Imprimir(3, c, "A"); 
        Imprimir hilo2 = new Imprimir(2, c, "B");
        Imprimir hilo3 = new Imprimir(4, c, "C");
        
             hilo1.start();
             hilo2.start();
             hilo3.start(); 
             
             
        try{
            Thread.sleep(6000);
            for(int i=0; i <3; i++){
                System.out.print(c.mostrarCad());
            }
        }catch(InterruptedException e){
            Logger.getLogger(main7.class.getName()).log(Level.SEVERE, null, e);

        }     
            
                
    }
}
