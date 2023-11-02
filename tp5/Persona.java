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
public class Persona extends Thread {

    private Piscina p;

    public Persona(Piscina unaPiscina) {
        p = unaPiscina;
    }

    public void run() {
        p.solicitarEntrar();
        System.out.println("La persona " + Thread.currentThread().getName() + " solicito entrar a la pilee");
        try {
            p.sumergirse();
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }

        p.salir();
    }
}
