/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * * @author Tomas
 */
public class Encargado extends Thread {

    private Mirador mirador;

    public Encargado(Mirador m) {
        mirador = m;
    }

    public void run() {
        while (true) {
            try {
                mirador.controlarTobogan();
            } catch (InterruptedException ex) {
                Logger.getLogger(Encargado.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Encargado.class.getName()).log(Level.SEVERE, null, ex);
            }

            mirador.dejarTirarse();
        }
    }
}
