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
public class Empleado extends Thread {

    private Confiteria confi;
    private char tipo;

    public Empleado(Confiteria c, char tipo) {
        confi = c;
        this.tipo = tipo;
    }

    public void run() {

        switch (tipo) {
            case 'a': {
                try {
                    confi.sentarse();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    confi.solicitarComidaYbebida();
                    System.out.println("El empleado " + Thread.currentThread().getName() + " solicito bebida y comida");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    confi.solicitarBebida();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    confi.recibirBebida(tipo);
                    System.out.println("El empleado recibio la bebida");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    confi.recibirComida();
                    System.out.println("El empleado recibio la comida");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    System.out.println("El empleado " + Thread.currentThread().getName() + " esta comiendo");
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

                confi.liberarSilla();

                break;
            }

            case 'b': {
                 try {
                    confi.sentarse();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    confi.solicitarBebida();
                    System.out.println("El empleado " + Thread.currentThread().getName() + " solicito bebida");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    confi.recibirBebida(tipo);
                    System.out.println("El empleado " + Thread.currentThread().getName() + "  recibio la bebida");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

                confi.liberarSilla();

                break;
            }

            case 'c': {
                 try {
                    confi.sentarse();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    confi.solicitarComida();
                    System.out.println("El empleado " + Thread.currentThread().getName() + " solicito comida");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    confi.recibirComida();
                     System.out.println("El empleado" + Thread.currentThread().getName() + " recibio la comida");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

                confi.liberarSilla();

                break;
            }
        }

    }
}
