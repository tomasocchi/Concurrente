/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TorreControl extends Thread{

    private Pista pista;

    public TorreControl(Pista p) {
        pista = p;
    }

    public void run() {
        while (true) {

            try {
                pista.verificarAterrizajes();
            } catch (InterruptedException ex) {
                Logger.getLogger(TorreControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                pista.verificaDespegue();
            } catch (InterruptedException ex) {
                Logger.getLogger(TorreControl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}