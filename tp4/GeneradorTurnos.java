/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
public class GeneradorTurnos {

    Semaphore mutex1 = new Semaphore(1);
    Semaphore mutex2 = new Semaphore(0);
    Semaphore mutex3 = new Semaphore(0);

    public void turno(char c) {
        try {
            switch (c) {
                case 'a':
                    System.out.println("El hilo "+Thread.currentThread().getName()+" espera el permiso");
                    mutex1.acquire();
                    System.out.println("----El hilo "+Thread.currentThread().getName()+" obtuvo el permiso----");
                    Thread.sleep(100);
                    mutex3.release();
                    break;
                case 'b':
                    System.out.println("El hilo "+Thread.currentThread().getName()+" espera el permiso");
                    mutex2.acquire();
                    System.out.println("----El hilo "+Thread.currentThread().getName()+" obtuvo el permiso----");
                    Thread.sleep(100);
                    mutex1.release();
                    break;
                case 'c':
                    System.out.println("El hilo "+Thread.currentThread().getName()+" espera el permiso");   
                    mutex3.acquire();
                    System.out.println("----El hilo "+Thread.currentThread().getName()+" obtuvo el permiso----"); 
                    Thread.sleep(100);
                    mutex2.release();
                    break;
            }
        } catch (InterruptedException e) {

     }
    }
}
