
package tp5;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
//objeto pasivo
public class Confiteria {

    Semaphore silla = new Semaphore(2);
    Semaphore pedirBebida = new Semaphore(0);
    Semaphore pedirComida = new Semaphore(0);
    Semaphore tomar = new Semaphore(0);
    Semaphore comer = new Semaphore(0);

    public void sentarse() throws InterruptedException {
        silla.acquire();
    }


    public void solicitarComidaYbebida() throws InterruptedException {
        pedirBebida.release();
    }

    public void solicitarBebida() throws InterruptedException {
        pedirBebida.release();
    }

    public void solicitarComida() throws InterruptedException {
        pedirComida.release(); 
    }

    public void servirBebida() throws InterruptedException {
        pedirBebida.acquire();
    }
    
    public void servirComida() throws InterruptedException{
        pedirComida.acquire();
        
    }

    public void entregarBebida() {
        tomar.release();
    }

    public void recibirBebida(char tipo) throws InterruptedException {
        tomar.acquire();
        if (tipo == 'a') {
            pedirComida.release();
        }

    }

    public void entregarComida() {
        comer.release();
    }

    public void recibirComida() throws InterruptedException {
        comer.acquire();
          
    }

    public void liberarSilla(){
        System.out.println("El empleado "+Thread.currentThread().getName()+" terminó de consumir alguito y liberó el lugar");
        silla.release();
    }

}
