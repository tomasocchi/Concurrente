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
public class Pista {

    int aterrizajes = 0;
    int cantDes;
    int cantAte;
    Semaphore largar = new Semaphore(0);
    Semaphore aterrizar = new Semaphore(1);
    Semaphore solicitarAterrizaje = new Semaphore(0);
    Semaphore solicitarDespegue = new Semaphore(0);

    public Pista(int cantidadDespegan, int cantidadAterrizan) {
        cantDes = cantidadDespegan;
        cantAte = cantidadAterrizan;
    }

    public void solicitaAterrizaje() throws InterruptedException {
        aterrizar.acquire();
        System.out.println("El avion " + Thread.currentThread().getName() + " solicita el aterrizaje");
        cantAte--;
    }

    public void aterriza() throws InterruptedException {
        aterrizajes++;
        System.out.println("El avion " + Thread.currentThread().getName() + " ya se encuentra en el hangar");

        if (aterrizajes == 10 && cantDes > 0) {
            solicitarDespegue.release(1);
            aterrizajes = 0;
        } else {
            if (cantAte == 0 && cantDes > 0) {
                solicitarDespegue.release(10);
            } else {
                solicitarDespegue.release(1);
                aterrizar.release();
            }
        }

    }

    public void verificarAterrizajes() throws InterruptedException {
        solicitarDespegue.acquire(10);
        System.out.println("------- LA TORRE DE CONTROL PERMITE EL DESPEGUE --------");
        largar.release();

    }

    public void solicitaDespegue() throws InterruptedException {
        largar.acquire();
        System.out.println("El avion " + Thread.currentThread().getName() + " solicita el despegue");
        cantDes--;
    }

    public void despega() {
        System.out.println("El avion " + Thread.currentThread().getName() + " acaba de despegar");
        if(cantAte == 0 && cantDes >0){
            largar.release();
        }else{
           solicitarAterrizaje.release();

        }
    }

    public void verificaDespegue() throws InterruptedException {
        solicitarAterrizaje.acquire();
        if (cantAte > 0) {
            System.out.println("------ LA TORRE DE CONTROL PERMITE EL ATERRIZAJE ------");
            aterrizar.release();
        } else {
            if (cantDes > 0) {
                largar.release();
            }
        }

    }
}
