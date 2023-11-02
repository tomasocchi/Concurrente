
package tp4;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
public class Confiteria {
 
  Semaphore puerta = new Semaphore(1); 
  Semaphore silla = new Semaphore(0); 
  Semaphore mozo = new Semaphore(0); 
  
  
  public void solicitarComer() throws InterruptedException{
      puerta.acquire();
      System.out.println("El empleado "+Thread.currentThread().getName()+" le pide al mozo algun bajon");
      mozo.release();
  }
  
  public void esperarCliente() throws InterruptedException{
      System.out.println("El mozo se pone a pelotudear con su hobbie");
      mozo.acquire();
  }
  
  public void sentarse() throws InterruptedException{
      silla.acquire();
  }
  
  public void prepararMesa(){
      silla.release();
  }
  
  public void limpiarMesa(){
      silla.release();
  }
  
  public void irse(){
      puerta.release();
  }
}
