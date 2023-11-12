package tp8.ej3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Pasteleria2 {
    Semaphore mostrador = new Semaphore(5); 
    Semaphore control = new Semaphore(0); 
    Semaphore mutex = new Semaphore(1); 
    Semaphore empaquetador = new Semaphore(0); 
    Semaphore brazo = new Semaphore(0); 
    Semaphore accion = new Semaphore(0); 
    int pesoActualCaja = 0, pesoTotalCaja, pesoPastel; 
    private Queue<Integer> colaMostrador= new LinkedList<Integer>(); 

    public Pasteleria2(int peso){
        pesoTotalCaja = peso; 
    }

//Metodos Pastel
    public void ingresarMostrador() throws InterruptedException{
        mostrador.acquire();
        System.out.println("Un pastel se coloca en el mostrador");
        mutex.acquire();
    }

    public void solicitarEntrarCaja(int peso){
       colaMostrador.add(peso); 
       empaquetador.release();
    }

//Metodo control
 /*    public void verificarPastel() throws InterruptedException{
        control.acquire();
        empaquetador.release();
    }
*/

//Metodos empaquetador    
    public int tomarPastel() throws InterruptedException{
        empaquetador.acquire();
        pesoPastel = colaMostrador.poll();
        System.out.println("El "+Thread.currentThread().getName()+" toma un pastel, peso del pastel: "+pesoPastel);
        mostrador.release();
        return pesoPastel; 
    }
    
    public void verificarAccion(int peso) throws InterruptedException{
        if(peso + pesoActualCaja > pesoTotalCaja){
        System.out.println("--------------------------------------");   
        System.out.println("LA CAJA LLEGO AL MAXIMO DEL PESO POSIBLE");
        System.out.println("--------------------------------------");
           brazo.release();
        }else{
             accion.release(); 
        }
    }


    public void ponerPastel(int peso) throws InterruptedException{
           accion.acquire();
           pesoActualCaja = pesoActualCaja + peso; 
           System.out.println("--------------------------------------");
           System.out.println("EL "+Thread.currentThread().getName()+" coloca un pastel en la caja, peso actual de la caja: "+pesoActualCaja);
           System.out.println("--------------------------------------");
           mutex.release();
    }

//Metodos Brazo    
    public void retirarCaja() throws InterruptedException{
        brazo.acquire();
    }

    public void reponerCaja(){
        pesoActualCaja = 0; 
        System.out.println("--------------------------------------");
        System.out.println("YA SE REPUSO UNA NUEVA CAJA");
        accion.release();
    }

}
