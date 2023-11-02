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
public class Cliente6 extends Thread {

    private Taxi tax;

    public Cliente6(Taxi t) {
        tax = t;
    }

    public void run() {

            
            try {
                tax.solicitarViaje();
                System.out.println("El cliente " + Thread.currentThread().getName() + " se subio al taxi");
            } catch (InterruptedException ex) {
                Logger.getLogger(Cliente6.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                tax.viajando();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cliente6.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                System.out.println("El cliente " + Thread.currentThread().getName() + " llego a su destino");
                tax.irse();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cliente6.class.getName()).log(Level.SEVERE, null, ex);
            }
           
  

    }
}
