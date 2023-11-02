/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
public class Piscina {

    Semaphore piletita = new Semaphore(5);
    Semaphore solicitaPile = new Semaphore(0);
    Semaphore dejarEntrar = new Semaphore(0);

    public void solicitarEntrar() {
        solicitaPile.release();
    }

    public void dejarEntrar() throws InterruptedException {
        solicitaPile.acquire();
    }

    public void controlarEntrada() {
        dejarEntrar.release();
    }

    public void sumergirse() throws InterruptedException {
        dejarEntrar.acquire();
        piletita.acquire();
        System.out.println("La persona " + Thread.currentThread().getName() + " está usando la pilee");
    }

    public void salir() {
         System.out.println("La persona " + Thread.currentThread().getName() + " salió de la pilee");
         piletita.release();
    }
}
