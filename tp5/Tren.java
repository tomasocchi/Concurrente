package tp5;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
public class Tren {

    int cantidad = 4;
    Semaphore mutex = new Semaphore(1);
    Semaphore ticket = new Semaphore(0);
    Semaphore puerta = new Semaphore(cantidad);
    Semaphore realizarViaje = new Semaphore(0);
    Semaphore puertaSalida = new Semaphore(0);
    Semaphore vaciar = new Semaphore(0);

    int disponibilidad = 0;

    public void comprarTicket() throws InterruptedException {
        System.out.println("El cliente " + Thread.currentThread().getName() + " solicita un ticket");
        mutex.release();
    }

    public void venderTicket() throws InterruptedException {
        mutex.acquire();
        Thread.sleep(100);
        ticket.release();
    }

    public void subirAlTren() throws InterruptedException {
        System.out.println("El cliente " + Thread.currentThread().getName() + " compro el ticket");

        //hilo cliente
        ticket.acquire();
        puerta.acquire();
        Thread.sleep(100);
    }

    public void sentarse() throws InterruptedException {
        realizarViaje.release(1);
    }

    public void bajarse() throws InterruptedException {
        puertaSalida.acquire();
        System.out.println("----El cliente " + Thread.currentThread().getName() + " se bajó al tren ----");
        vaciar.release(1);
        
    }

    public void empezarViaje() throws InterruptedException {
        realizarViaje.acquire(cantidad);
    }

    public void terminarViaje() {
        disponibilidad = 0;
        puertaSalida.release(cantidad);
    }

    public void liberarTren() throws InterruptedException {
        vaciar.acquire(cantidad);
        puerta.release(cantidad);
    }
}
