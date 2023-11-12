package tp8.ej4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Salita {
    Lock acceso = new ReentrantLock();
    Condition esperaRevistas = acceso.newCondition();
    Condition espera = acceso.newCondition();
    private Queue<Integer> colaEspera = new LinkedList<Integer>();
    private int camillas = 0, revistas = 0, sillas = 0;


    public void ingresar(int numero, boolean revistaEnUso, boolean sillaEnUso) {
        acceso.lock();
        try {
            colaEspera.add(numero);

            while (camillas >= 4 || numero != colaEspera.peek()) {

                if (sillas < 5 && !sillaEnUso) {
                    sillas++;
                    sillaEnUso = true; 
                    System.out.println("El " + Thread.currentThread().getName()
                            + " se sentó en una silla, cantidad de sillas usadas: sillas: " + sillas);
                }

                if (revistas < 9 && !revistaEnUso) {
                    revistas++;
                    revistaEnUso = true; 
                    System.out.println("El " + Thread.currentThread().getName()
                            + " agarró una revista, cantidad de revistas usadas " + revistas);
                }
                if(!sillaEnUso &&!revistaEnUso){
                   System.out.println("El " + Thread.currentThread().getName() + " se puso a ver CronicaTV");
                }
                espera.await();
            }

            
            camillas++;
            if (sillas > 0) {
                sillas--;
            }
            if (revistas > 0) {
                revistas--;
            }

            colaEspera.poll(); 
            if(!colaEspera.isEmpty()) {
                System.out.println("PROXIMO NUMERO PARA ENTRAR: "+colaEspera.peek());

            }
            System.out.println("..............................");
            System.out.println("El " + Thread.currentThread().getName()
                    + " Ya se encuentra donando sangre, cantidad de camillas ocupadas: " + camillas);
            System.out.println("..............................");

            espera.signalAll();

        } catch (InterruptedException e) {

        } finally {
            acceso.unlock();
        }
    }



    public void salirSala() {
        acceso.lock();
        try {
            camillas--;
            
            System.out.println("..............................");
            System.out.println("El " + Thread.currentThread().getName()
                    + " salió de la salita, cantidad de camillas disponibles: " + camillas);
            System.out.println("..............................");
            espera.signalAll();
        } finally {
            acceso.unlock();
        }
    }

}
