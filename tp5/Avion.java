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
public class Avion extends Thread {

    private Pista pista;
    private char tipoAccion;

    public Avion(String nombre, Pista p, char tipo) {
        this.setName(nombre);
        pista = p;
        tipoAccion = tipo;
    }

    public void run() {

        switch (tipoAccion) {
            case 'a':
                try {
                    pista.solicitaAterrizaje();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Avion.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Avion.class.getName()).log(Level.SEVERE, null, ex);
                }


            try {
                pista.aterriza();
            } catch (InterruptedException ex) {
                Logger.getLogger(Avion.class.getName()).log(Level.SEVERE, null, ex);
            }


                break;
            case 'd':

                try {
                    pista.solicitaDespegue();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Avion.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Avion.class.getName()).log(Level.SEVERE, null, ex);
                }

                pista.despega();

                break;

        }

    }
}