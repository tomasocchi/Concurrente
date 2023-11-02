package tp6.ej4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Almacen {

    private int cantProd;
    private int lleno;

    public Almacen(int maximo) {
        lleno = maximo;
    }

    public synchronized void recargar() {
        try {
            while (cantProd >= lleno) {
                this.wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        cantProd++;
        this.notifyAll();
        
        System.out.println("----Un productor agrega un producto al almacen, cantidad de productos " + cantProd + "----");
    }
    
    
    public synchronized void terminar(){
        System.out.println("El productor terminó de trabajar");
    }

    public synchronized void sacar() {
        try {
            while (cantProd == 0) {
                this.wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }

        cantProd--;
        this.notifyAll();
        System.out.println("Un consumidor saca un producto, cantidad de productos " + cantProd);
    }
    
    public synchronized void terminar2(){
        System.out.println("Un consumidor se fué");
    }

}
