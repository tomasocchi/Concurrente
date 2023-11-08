package tp7.ej1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Museo {
    private Lock accesoMuseo;
    private Condition colaVisitantes;
    private Condition colaJubilados;
    private int cantidad, cantidadActual = 0, canJesperando = 0;

    public Museo(int cant) {
        cantidad = cant;
        accesoMuseo = new ReentrantLock(true);
        colaVisitantes = accesoMuseo.newCondition();
        colaJubilados = accesoMuseo.newCondition();
    }

    public void entrarSala() throws InterruptedException {
        try {
            accesoMuseo.lock();
            while (cantidadActual >= cantidad || canJesperando > 0) {
                colaVisitantes.await();
            }
            cantidadActual++;
            System.out.println("Un " + Thread.currentThread().getName() + " ingreso a la sala, cantidad en sala: "
                    + cantidadActual);
        } catch (InterruptedException e) {
        } finally {
            accesoMuseo.unlock();
        }
    }

    public void entrarSalaJubilado() throws InterruptedException {

        try {

            accesoMuseo.lock();
            canJesperando++;
            while (cantidadActual >= cantidad) {
                colaJubilados.await();
            }
            cantidadActual++;

            canJesperando--;
            if (canJesperando == 0 && cantidadActual < cantidad) {
                colaVisitantes.signalAll();
            }
            System.out.println("Un " + Thread.currentThread().getName() + " ingreso a la sala, cantidad en sala: "
                    + cantidadActual);

        } catch (InterruptedException e) {
        } finally {
            accesoMuseo.unlock();
        }
    }

    public void salirSala() {
        accesoMuseo.lock();
        cantidadActual--;
        System.out.println("Un " + Thread.currentThread().getName() + " salio de la sala");

        if (canJesperando > 0) {
            colaJubilados.signalAll();
        } else {
            colaVisitantes.signalAll();
        }
        accesoMuseo.unlock();

    }

    public void notificarTemperatura(int temperatura) {
        try {
            accesoMuseo.lock();
            System.out.println("TEMPERATURA DE LA SALA: " + temperatura);
            if (temperatura > 30) {
                System.out.println("SE CAMBIA CANTIDAD");
                cantidad = 3;
            } else {
                cantidad = 5;
            }
        } catch (Exception e) {
        } finally {
            accesoMuseo.unlock();
        }
    }

}