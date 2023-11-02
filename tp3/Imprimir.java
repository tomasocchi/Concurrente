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
public class Imprimir extends Thread {

    private String turno;
    private int cantidad;
    private Cadena cad;
    private boolean paso = false;

    public Imprimir(int c, Cadena ca, String t) {
        turno = t;
        cantidad = c;
        cad = ca;
    }

    private synchronized void creaCad(int c, String turno) {
        if (cad.verificarCad(turno)) {
            cad.creaCad(turno, c);
            cad.cambiarTurno(turno);
            paso = true;
        }
    }

    public void run() {
            try {
                while (!paso) {
                    creaCad(this.cantidad, this.turno);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, e);
            }

        }
    
    }

